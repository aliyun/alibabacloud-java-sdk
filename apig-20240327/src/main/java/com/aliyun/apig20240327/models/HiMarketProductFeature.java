// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductFeature extends TeaModel {
    @NameInMap("modelFeature")
    public HiMarketModelFeature modelFeature;

    public static HiMarketProductFeature build(java.util.Map<String, ?> map) throws Exception {
        HiMarketProductFeature self = new HiMarketProductFeature();
        return TeaModel.build(map, self);
    }

    public HiMarketProductFeature setModelFeature(HiMarketModelFeature modelFeature) {
        this.modelFeature = modelFeature;
        return this;
    }
    public HiMarketModelFeature getModelFeature() {
        return this.modelFeature;
    }

}
