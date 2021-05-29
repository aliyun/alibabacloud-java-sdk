// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210529_225315425.models;

import com.aliyun.tea.*;

public class BundleOpenAPiRequest extends TeaModel {
    @NameInMap("f1")
    public Integer f1;

    @NameInMap("f2")
    public Integer f2;

    public static BundleOpenAPiRequest build(java.util.Map<String, ?> map) throws Exception {
        BundleOpenAPiRequest self = new BundleOpenAPiRequest();
        return TeaModel.build(map, self);
    }

    public BundleOpenAPiRequest setF1(Integer f1) {
        this.f1 = f1;
        return this;
    }
    public Integer getF1() {
        return this.f1;
    }

    public BundleOpenAPiRequest setF2(Integer f2) {
        this.f2 = f2;
        return this;
    }
    public Integer getF2() {
        return this.f2;
    }

}
