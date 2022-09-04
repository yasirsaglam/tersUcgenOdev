import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = input.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i); k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}