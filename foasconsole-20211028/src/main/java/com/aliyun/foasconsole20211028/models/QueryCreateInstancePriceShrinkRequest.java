// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceShrinkRequest extends TeaModel {
    @NameInMap("ArchitectureType")
    public String architectureType;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("Ha")
    public Boolean ha;

    @NameInMap("HaResourceSpec")
    public String haResourceSpecShrink;

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

    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    @NameInMap("VSwitchIds")
    public String vSwitchIdsShrink;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static QueryCreateInstancePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceShrinkRequest self = new QueryCreateInstancePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceShrinkRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public QueryCreateInstancePriceShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public QueryCreateInstancePriceShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public QueryCreateInstancePriceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryCreateInstancePriceShrinkRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryCreateInstancePriceShrinkRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public QueryCreateInstancePriceShrinkRequest setHaResourceSpecShrink(String haResourceSpecShrink) {
        this.haResourceSpecShrink = haResourceSpecShrink;
        return this;
    }
    public String getHaResourceSpecShrink() {
        return this.haResourceSpecShrink;
    }

    public QueryCreateInstancePriceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public QueryCreateInstancePriceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryCreateInstancePriceShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public QueryCreateInstancePriceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryCreateInstancePriceShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

    public QueryCreateInstancePriceShrinkRequest setStorageShrink(String storageShrink) {
        this.storageShrink = storageShrink;
        return this;
    }
    public String getStorageShrink() {
        return this.storageShrink;
    }

    public QueryCreateInstancePriceShrinkRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    public QueryCreateInstancePriceShrinkRequest setVSwitchIdsShrink(String vSwitchIdsShrink) {
        this.vSwitchIdsShrink = vSwitchIdsShrink;
        return this;
    }
    public String getVSwitchIdsShrink() {
        return this.vSwitchIdsShrink;
    }

    public QueryCreateInstancePriceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QueryCreateInstancePriceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
