// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class YxTestSingleNbfApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static YxTestSingleNbfApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleNbfApiResponseBody self = new YxTestSingleNbfApiResponseBody();
        return TeaModel.build(map, self);
    }

    public YxTestSingleNbfApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
