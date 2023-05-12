import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author yishun
 * @create 2023-05-11-17:04
 */
@SpringBootTest
public class demo {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[]{100,23,43,103,200,18,39,143,423}));
        Collections.sort(list);  //默认升序

    }
}
