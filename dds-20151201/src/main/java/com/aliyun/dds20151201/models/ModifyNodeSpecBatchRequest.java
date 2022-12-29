// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecBatchRequest extends TeaModel {
    // Specifies whether to enable automatic payment for the instance. Valid values:
    // 
    // *   **true**: enables automatic payment. Make sure that your account balance is sufficient.
    // *   **false**: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, click **Expenses** to go to the **Billing Management** console. In the left-side navigation pane, click **Orders**. On the **Orders** page, find the order and complete the payment.
    // 
    // Default value: **true**.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The business information.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The coupon code. Default value: **youhuiquan_promotion_option_id_for_blank**.
    @NameInMap("CouponNo")
    public String couponNo;

    // The ID of the instance whose configurations you want to change.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The time when the changed configurations take effect. Valid values:
    // 
    // *   **Immediately**: The configurations immediately take effect.
    // 
    // *   **MaintainTime**: The configurations take effect during the maintenance window of the instance.
    // 
    //   > *   You can call the [ModifyDBInstanceMaintainTime](~~62008~~) operation to modify the maintenance window of an instance.
    //    *   You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to view the maintenance window of an instance.
    // 
    //     Default value: **Immediately**.
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    // The configuration information of the mongos nodes or shard nodes whose configurations you want to change. For more information, see [Instance types](~~57141~~).
    @NameInMap("NodesInfo")
    public String nodesInfo;

    // The type of configuration changes. Valid values:
    // 
    // *   **UPGRADE**
    // 
    // *   **DOWNGRADE**
    // 
    // > This parameter can be configured only when the billing method of the instance is subscription.
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the region ID of the instance.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyNodeSpecBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecBatchRequest self = new ModifyNodeSpecBatchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecBatchRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeSpecBatchRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyNodeSpecBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNodeSpecBatchRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyNodeSpecBatchRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyNodeSpecBatchRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyNodeSpecBatchRequest setNodesInfo(String nodesInfo) {
        this.nodesInfo = nodesInfo;
        return this;
    }
    public String getNodesInfo() {
        return this.nodesInfo;
    }

    public ModifyNodeSpecBatchRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyNodeSpecBatchRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNodeSpecBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNodeSpecBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNodeSpecBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNodeSpecBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNodeSpecBatchRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
