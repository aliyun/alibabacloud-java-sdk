// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and must be canceled.
    // *   false: An order is generated but no payment is made.
    // 
    // Default value: true.
    // 
    // >  If your account balance is insufficient, you can set the `AutoPay` parameter to `false` to generate an unpaid order. Then, you can pay for the order.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The new billing method for the dedicated host. Valid values:
    // 
    // *   PrePaid: changes the billing method from pay-as-you-go to subscription.
    // *   PostPaid: changes the billing method from subscription to pay-as-you-go.
    // 
    // Default value: PrePaid.
    @NameInMap("DedicatedHostChargeType")
    public String dedicatedHostChargeType;

    // The IDs of dedicated hosts. The value can be a JSON array that consists of up to 20 dedicated host IDs. Separate the dedicated host IDs with commas (,).
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    // Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go.
    // 
    // Default value: false.
    @NameInMap("DetailFee")
    public Boolean detailFee;

    // Specifies whether to check the validity of the request without actually making the request. Valid values:
    // 
    // *   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.
    // *   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.
    // 
    // Default value: false.
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The renewal duration of the subscription dedicated host. Valid values:
    // 
    // *   When `PeriodUnit` is set to Week, valid values of `Period` are 1, 2, 3, and 4.
    // *   When `PeriodUnit` is set to Month, valid values of `Period` are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
    @NameInMap("Period")
    public Integer period;

    // The unit of the renewal duration (`Period`). Valid values:
    // 
    // *   Week
    // *   Month
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The region ID of the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDedicatedHostsChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostsChargeTypeRequest self = new ModifyDedicatedHostsChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostsChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDedicatedHostsChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDedicatedHostsChargeTypeRequest setDedicatedHostChargeType(String dedicatedHostChargeType) {
        this.dedicatedHostChargeType = dedicatedHostChargeType;
        return this;
    }
    public String getDedicatedHostChargeType() {
        return this.dedicatedHostChargeType;
    }

    public ModifyDedicatedHostsChargeTypeRequest setDedicatedHostIds(String dedicatedHostIds) {
        this.dedicatedHostIds = dedicatedHostIds;
        return this;
    }
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    public ModifyDedicatedHostsChargeTypeRequest setDetailFee(Boolean detailFee) {
        this.detailFee = detailFee;
        return this;
    }
    public Boolean getDetailFee() {
        return this.detailFee;
    }

    public ModifyDedicatedHostsChargeTypeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDedicatedHostsChargeTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDedicatedHostsChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostsChargeTypeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyDedicatedHostsChargeTypeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyDedicatedHostsChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostsChargeTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostsChargeTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
