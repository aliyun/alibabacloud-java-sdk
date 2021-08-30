// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class ApidasResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static ApidasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApidasResponseBody self = new ApidasResponseBody();
        return TeaModel.build(map, self);
    }

    public ApidasResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
