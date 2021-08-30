// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestTwoResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static TestTwoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestTwoResponseBody self = new TestTwoResponseBody();
        return TeaModel.build(map, self);
    }

    public TestTwoResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
