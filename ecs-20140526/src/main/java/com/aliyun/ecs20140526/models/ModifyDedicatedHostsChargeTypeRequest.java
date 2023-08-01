// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>*   true: The payment is automatically completed. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and will be canceled.</p>
     * <p>*   false: An order is generated but no payment is made.</p>
     * <br>
     * <p>Default value: true.</p>
     * <br>
     * <p>> If you do not have sufficient balance in your account, you can set `AutoPay` to `false` to generate an unpaid order. Then, you can pay for the order.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new billing method of the dedicated hosts. Valid values:</p>
     * <br>
     * <p>*   PrePaid: changes the billing method from pay-as-you-go to subscription.</p>
     * <p>*   PostPaid: changes the billing method from subscription to pay-as-you-go.</p>
     * <br>
     * <p>Default value: PrePaid.</p>
     */
    @NameInMap("DedicatedHostChargeType")
    public String dedicatedHostChargeType;

    /**
     * <p>The IDs of the dedicated hosts. The value can be a JSON array that consists of up to 20 dedicated host IDs. Separate the IDs with commas (,).</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DetailFee")
    public Boolean detailFee;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The renewal duration of the subscription dedicated hosts. Valid values:</p>
     * <br>
     * <p>*   If you set `PeriodUnit` to Week, valid values of `Period` are 1, 2, 3, and 4.</p>
     * <p>*   If you set `PeriodUnit` to Month, valid values of `Period` are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration specified by `Period`. Valid values:</p>
     * <br>
     * <p>*   Week</p>
     * <p>*   Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the dedicated hosts. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
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
