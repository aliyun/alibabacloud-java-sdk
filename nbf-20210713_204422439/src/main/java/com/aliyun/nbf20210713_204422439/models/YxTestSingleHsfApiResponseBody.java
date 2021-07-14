// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class YxTestSingleHsfApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static YxTestSingleHsfApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleHsfApiResponseBody self = new YxTestSingleHsfApiResponseBody();
        return TeaModel.build(map, self);
    }

    public YxTestSingleHsfApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
