import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        StringBuilder builder = new StringBuilder();
        StringBuilder append = builder.append(text);
        System.out.println(reverseString(append));


        if (palindromWord(append)) {
            System.out.println("polidromdur");

        } else {
            System.out.println("polidrom deyil");
        }
    }

    public static StringBuilder reverseString(StringBuilder text) {

        StringBuilder reverseText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText.append(text.charAt(i));
        }
        return reverseText;
    }

    public static boolean palindromWord(StringBuilder checkText) {
        return checkText.toString().equals(reverseString(checkText).toString());
    }
}