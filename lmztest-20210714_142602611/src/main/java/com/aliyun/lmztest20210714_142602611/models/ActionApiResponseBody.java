// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class ActionApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static ActionApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActionApiResponseBody self = new ActionApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ActionApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
