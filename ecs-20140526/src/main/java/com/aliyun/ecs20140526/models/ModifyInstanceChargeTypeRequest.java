// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p>true: Automatic payment is enabled. Make sure that your account balance is sufficient. If your account balance is insufficient, an abnormal order is generated and can only be canceled.</p>
     * </li>
     * <li><p>false: Only an order is generated and no payment is made.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <p>If the balance of your payment method is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the ECS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and make sure that the value is unique across different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p>true: send a dry run request. The system does not query resources. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user has the required authorization, and whether required parameters are specified. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p>false: send a normal request. If the dry run succeeds, the 2xx HTTP status code is returned and resources are queried.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to change the billing method of all pay-as-you-go data disks attached to the instance to subscription. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDataDisks")
    public Boolean includeDataDisks;

    /**
     * <p>The target billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p>PrePaid: switches the billing method of the instance from pay-as-you-go to subscription.</p>
     * </li>
     * <li><p>PostPaid: switches the billing method of the instance from subscription to pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>Default value: PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance IDs. The value can be a JSON array that consists of up to 20 instance IDs. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp67acfmxazb4p****&quot;,&quot;i-bp67acfmxazb4d****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>Specifies whether to return the order fee details when you switch the billing method from subscription to pay-as-you-go. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDetailFee")
    public Boolean isDetailFee;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period. If the host of the ECS instance is a dedicated host (DDH), the value cannot exceed the subscription period of the DDH. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>When <code>PeriodUnit</code> is set to <code>Week</code>, valid values of <code>Period</code> are 1, 2, 3, and 4.</li>
     * <li>When <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>Period</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;When <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>Period</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period, which is the unit of the <code>Period</code> parameter. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week</li>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;Month</p>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeRequest self = new ModifyInstanceChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceChargeTypeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyInstanceChargeTypeRequest setIncludeDataDisks(Boolean includeDataDisks) {
        this.includeDataDisks = includeDataDisks;
        return this;
    }
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    public ModifyInstanceChargeTypeRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyInstanceChargeTypeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstanceChargeTypeRequest setIsDetailFee(Boolean isDetailFee) {
        this.isDetailFee = isDetailFee;
        return this;
    }
    public Boolean getIsDetailFee() {
        return this.isDetailFee;
    }

    public ModifyInstanceChargeTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceChargeTypeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyInstanceChargeTypeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyInstanceChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceChargeTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceChargeTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
