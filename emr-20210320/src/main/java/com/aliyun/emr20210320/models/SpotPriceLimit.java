// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class SpotPriceLimit extends TeaModel {
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PriceLimit")
    public Double priceLimit;

    public static SpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
        SpotPriceLimit self = new SpotPriceLimit();
        return TeaModel.build(map, self);
    }

    public SpotPriceLimit setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SpotPriceLimit setPriceLimit(Double priceLimit) {
        this.priceLimit = priceLimit;
        return this;
    }
    public Double getPriceLimit() {
        return this.priceLimit;
    }

}
