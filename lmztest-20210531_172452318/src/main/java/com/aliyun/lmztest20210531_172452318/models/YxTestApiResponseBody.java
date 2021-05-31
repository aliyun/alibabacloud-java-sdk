// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210531_172452318.models;

import com.aliyun.tea.*;

public class YxTestApiResponseBody extends TeaModel {
    // sum
    @NameInMap("sum")
    public Integer sum;

    public static YxTestApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        YxTestApiResponseBody self = new YxTestApiResponseBody();
        return TeaModel.build(map, self);
    }

    public YxTestApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
