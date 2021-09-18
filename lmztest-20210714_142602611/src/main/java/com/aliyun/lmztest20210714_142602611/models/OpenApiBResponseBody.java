// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class OpenApiBResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static OpenApiBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiBResponseBody self = new OpenApiBResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiBResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
