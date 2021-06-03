// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    public static CreateAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAcceleratorRequest self = new CreateAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAcceleratorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAcceleratorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAcceleratorRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateAcceleratorRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateAcceleratorRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateAcceleratorRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAcceleratorRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

}
