// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <ul>
     * <li>true (default): The payment is automatically completed. Maintain sufficient balance in your account. Otherwise, your order becomes invalid and must be canceled.</li>
     * <li>false: An order is generated but no payment is made. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, log on to the <strong>Expenses and Costs console</strong>, go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Orders page</a>, and pay for the order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new billing method of the disk. Valid values:</p>
     * <ul>
     * <li>PrePaid (default): changes the billing method from pay-as-you-go to subscription.</li>
     * <li>PostPaid: changes the billing method from subscription to pay-as-you-go.</li>
     * </ul>
     * <blockquote>
     * <p> When you change the billing method of a pay-as-you-go disk to subscription, the billing cycle of the disk is automatically synchronized with that of the associated ECS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The IDs of disks. The value is a JSON array that consists of up to 16 disk IDs. Separate the disk IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[“d-bp67acfmxazb4ph****”, “d-bp67acfmxazb4pi****”, … “d-bp67acfmxazb4pj****”]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The ID of the instance to which disks are attached.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i778bq705cvx1****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static ModifyDiskChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeRequest self = new ModifyDiskChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDiskChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskChargeTypeRequest setDiskChargeType(String diskChargeType) {
        this.diskChargeType = diskChargeType;
        return this;
    }
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    public ModifyDiskChargeTypeRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public ModifyDiskChargeTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskChargeTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDiskChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDiskChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskChargeTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDiskChargeTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
