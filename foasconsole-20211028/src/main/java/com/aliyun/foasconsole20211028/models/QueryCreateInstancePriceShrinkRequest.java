// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceShrinkRequest extends TeaModel {
    /**
     * <p>The processor architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: does not enable auto-renewal. (Default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is invalid for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing type. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of billing cycles.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The extended reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether to select zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>The zone-disaster recovery resource specifications.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaResourceSpec")
    public String haResourceSpecShrink;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-e2e-test-post</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The billing cycle. Subscription instances support only Year and Month. Pay-as-you-go instances support Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>500041860100636</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource specifications.</p>
     */
    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    /**
     * <p>The storage information.</p>
     */
    @NameInMap("Storage")
    public String storageShrink;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    /**
     * <p>The vSwitch IDs.</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIdsShrink;

    /**
     * <p>The VPC ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze9xoh8qyt1rnxfmfcdi</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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

}
