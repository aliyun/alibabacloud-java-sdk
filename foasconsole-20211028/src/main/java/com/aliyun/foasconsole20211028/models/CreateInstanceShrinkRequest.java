// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateInstanceShrinkRequest extends TeaModel {
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
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter does not take effect for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>POST: pay-as-you-go.</li>
     * <li>PRE: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The subscription duration.</p>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The extended field.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether to use zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
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
     * <p>The list of vSwitch IDs in the secondary zone for zone-disaster recovery.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaVSwitchIds")
    public String haVSwitchIdsShrink;

    /**
     * <p>The workspace name. The name must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-). The name cannot end with a hyphen.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-e2e-test-pre</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of monitoring and alerting service. You can select ARMS or CloudMonitor.</p>
     * 
     * <strong>example:</strong>
     * <p>TAIHAO</p>
     */
    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>year</strong>: year.</li>
     * <li><strong>month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
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
     * <p>500043499350689</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxbavps3rpiy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource specifications.</p>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
     */
    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    /**
     * <p>The storage parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Storage")
    public String storageShrink;

    /**
     * <p>The list of tags. A maximum of 20 tags can be specified.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li>true: Use a coupon.</li>
     * <li>false: Do not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    /**
     * <p>The list of vSwitch IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIdsShrink;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze9xoh8qyt1rnxfmfcdi</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShrinkRequest self = new CreateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShrinkRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
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

    public CreateInstanceShrinkRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public CreateInstanceShrinkRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public CreateInstanceShrinkRequest setHaResourceSpecShrink(String haResourceSpecShrink) {
        this.haResourceSpecShrink = haResourceSpecShrink;
        return this;
    }
    public String getHaResourceSpecShrink() {
        return this.haResourceSpecShrink;
    }

    public CreateInstanceShrinkRequest setHaVSwitchIdsShrink(String haVSwitchIdsShrink) {
        this.haVSwitchIdsShrink = haVSwitchIdsShrink;
        return this;
    }
    public String getHaVSwitchIdsShrink() {
        return this.haVSwitchIdsShrink;
    }

    public CreateInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceShrinkRequest setMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }
    public String getMonitorType() {
        return this.monitorType;
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

    public CreateInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateInstanceShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateInstanceShrinkRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
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

}
