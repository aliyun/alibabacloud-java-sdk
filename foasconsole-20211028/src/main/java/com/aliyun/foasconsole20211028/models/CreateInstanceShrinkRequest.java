// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateInstanceShrinkRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("PromotionCode")
    public String promotionCode;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    @NameInMap("Storage")
    public String storageShrink;

    @NameInMap("VSwitchIds")
    public String vSwitchIdsShrink;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShrinkRequest self = new CreateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateInstanceShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateInstanceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateInstanceShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

    public CreateInstanceShrinkRequest setStorageShrink(String storageShrink) {
        this.storageShrink = storageShrink;
        return this;
    }
    public String getStorageShrink() {
        return this.storageShrink;
    }

    public CreateInstanceShrinkRequest setVSwitchIdsShrink(String vSwitchIdsShrink) {
        this.vSwitchIdsShrink = vSwitchIdsShrink;
        return this;
    }
    public String getVSwitchIdsShrink() {
        return this.vSwitchIdsShrink;
    }

    public CreateInstanceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
