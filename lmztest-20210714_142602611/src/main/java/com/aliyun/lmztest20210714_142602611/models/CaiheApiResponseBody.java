// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class CaiheApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static CaiheApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CaiheApiResponseBody self = new CaiheApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CaiheApiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
