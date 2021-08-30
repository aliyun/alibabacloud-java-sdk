// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestOneResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static TestOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestOneResponseBody self = new TestOneResponseBody();
        return TeaModel.build(map, self);
    }

    public TestOneResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
