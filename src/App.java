import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30 };

        System.out.println("Find Index : ");
        int target = input.nextInt();
        bruteForceSearch(a, target);

    }

    private static void bruteForceSearch(int a[], int target) {
        for (int i = 0; i < a.length; i++) { // increment datanya
            if (a[i] == target) {
                System.out.println("Nilai index di array : " + i);
                break;
            }
        }
    }

}

/**
 * // Cara Binarysearch // int index = binarySearch(a, target); //
 * System.out.println("Nilai index di : " + index);
 * 
 * private static int binarySearch(int a[], int target) { int bawah = 0; int
 * atas = a.length - 1;
 * 
 * while (atas >= bawah) { int mid = bawah + (atas - bawah) / 2; if (target <
 * a[mid]) atas = mid - 1; else if (target > a[mid]) bawah = mid + 1; else
 * return mid; } return -1; }
 * 
 */