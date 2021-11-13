// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceRequest extends TeaModel {
    @NameInMap("CoreNumber")
    public Long coreNumber;

    @NameInMap("Duration")
    public Long duration;

    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static QueryScaleUpPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpPriceRequest self = new QueryScaleUpPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpPriceRequest setCoreNumber(Long coreNumber) {
        this.coreNumber = coreNumber;
        return this;
    }
    public Long getCoreNumber() {
        return this.coreNumber;
    }

    public QueryScaleUpPriceRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public QueryScaleUpPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryScaleUpPriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public QueryScaleUpPriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
