// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210529_225315425.models;

import com.aliyun.tea.*;

public class BundleOpenAPiResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static BundleOpenAPiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BundleOpenAPiResponseBody self = new BundleOpenAPiResponseBody();
        return TeaModel.build(map, self);
    }

    public BundleOpenAPiResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
