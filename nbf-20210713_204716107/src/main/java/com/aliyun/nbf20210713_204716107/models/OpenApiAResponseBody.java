// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class OpenApiAResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static OpenApiAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAResponseBody self = new OpenApiAResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiAResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
