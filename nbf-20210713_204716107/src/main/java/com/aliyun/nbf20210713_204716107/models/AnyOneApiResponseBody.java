// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class AnyOneApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static AnyOneApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnyOneApiResponseBody self = new AnyOneApiResponseBody();
        return TeaModel.build(map, self);
    }

    public AnyOneApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
