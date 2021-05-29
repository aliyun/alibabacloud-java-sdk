// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210528_154524307.models;

import com.aliyun.tea.*;

public class YxTestAPIResponseBody extends TeaModel {
    // sum
    @NameInMap("sum")
    public Integer sum;

    public static YxTestAPIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        YxTestAPIResponseBody self = new YxTestAPIResponseBody();
        return TeaModel.build(map, self);
    }

    public YxTestAPIResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
