// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAICloudPhoneRequest extends TeaModel {
    /**
     * <p>The quantity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the bandwidth plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np-791ncq8qcuoopxxxx</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The ID of the region for the purchase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-0aae4rxwoktvr851h</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the instance group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The specification of the instance group. Valid values:</p>
     * <ul>
     * <li>STANDARD: Standard.</li>
     * <li>MEDIUM: Advanced.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("InstanceGroupSpec")
    public String instanceGroupSpec;

    /**
     * <p>The subscription duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy group.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-0bjrh3oxk2q0xxxxx</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The ID of the coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_xxx</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static CreateAICloudPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAICloudPhoneRequest self = new CreateAICloudPhoneRequest();
        return TeaModel.build(map, self);
    }

    public CreateAICloudPhoneRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateAICloudPhoneRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAICloudPhoneRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateAICloudPhoneRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAICloudPhoneRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateAICloudPhoneRequest setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    public CreateAICloudPhoneRequest setInstanceGroupSpec(String instanceGroupSpec) {
        this.instanceGroupSpec = instanceGroupSpec;
        return this;
    }
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    public CreateAICloudPhoneRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAICloudPhoneRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAICloudPhoneRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateAICloudPhoneRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
