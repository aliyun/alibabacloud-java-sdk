// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>*   true: The payment is automatically completed. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled.</p>
     * <p>*   false: An order is generated but no payment is made.</p>
     * <br>
     * <p>Default value: true.</p>
     * <br>
     * <p>> If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid Values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are granted permissions, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to change the billing method of all data disks attached to the instance from pay-as-you-go to subscription.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IncludeDataDisks")
    public Boolean includeDataDisks;

    /**
     * <p>The new billing method. Valid values:</p>
     * <br>
     * <p>*   PrePaid</p>
     * <p>*   PostPaid</p>
     * <br>
     * <p>Default value: PrePaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance IDs. The value can be a JSON array that consists of up to 20 instance IDs. Separate the instance IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>Specifies whether to return cost details of the order after the billing method is changed from subscription to pay-as-you-go.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IsDetailFee")
    public Boolean isDetailFee;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The renewal duration of the subscription instance. If the instance is hosted on a dedicated host, the renewal duration of the instance cannot exceed the subscription duration of the dedicated host. Valid values:</p>
     * <br>
     * <p>Valid values when `PeriodUnit` is set to Month: `1, 2, 3, 4, 5, 6, 7, 8, 9, and 12`.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration specified by `Period`. Valid values:</p>
     * <br>
     * <p>Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
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
