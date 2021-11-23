// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static RenewResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageRequest self = new RenewResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public RenewResourcePackageRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RenewResourcePackageRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public RenewResourcePackageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewResourcePackageRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
