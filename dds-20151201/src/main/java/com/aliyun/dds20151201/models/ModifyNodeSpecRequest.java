// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Default value: true. Valid values:
    // 
    // *   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.
    // *   **false**: disables automatic payment. In this case, you must manually pay for the instance.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The business information. This is an additional parameter.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
    @NameInMap("CouponNo")
    public String couponNo;

    // The ID of the instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The time when the changed configurations take effect. Default value: Immediately. Valid values:
    // 
    // *   **Immediately**: The new configurations immediately take effect
    // *   **MaintainTime**: The new configurations take effect during the maintenance window of the instance.
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    // The source of the request. Valid values:
    // 
    // *   **OpenApi**: the ApsaraDB for MongoDB API
    // *   **mongo_buy**: the ApsaraDB for MongoDB console
    @NameInMap("FromApp")
    public String fromApp;

    // The instance type of the shard or mongos node. For more information, see [Instance types](~~57141~~).
    @NameInMap("NodeClass")
    public String nodeClass;

    // The ID of the shard or mongos node in the sharded cluster instance. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the node ID.
    // 
    // >  If you set this parameter to the ID of a shard node, you must also specify the **NodeStorage** parameter.
    @NameInMap("NodeId")
    public String nodeId;

    // The storage capacity of the shard node. Unit: GB.
    // 
    // *   Valid values are **10** to **2000** if the instance uses local SSDs.
    // *   Valid values are **20** to **16000** if the instance uses enhanced SSDs (ESSDs) at PL1.
    // 
    // >  The value must be a multiple of 10.
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    // The order type. Valid values:
    // 
    // *   **UPGRADE**
    // *   **DOWNGRADE**
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of read-only nodes in the shard node.
    // 
    // Valid values: **0** to **5**. The value must be an integer. Default value: **0**.
    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The execution time. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyNodeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecRequest self = new ModifyNodeSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeSpecRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyNodeSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNodeSpecRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyNodeSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyNodeSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyNodeSpecRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ModifyNodeSpecRequest setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }
    public String getNodeClass() {
        return this.nodeClass;
    }

    public ModifyNodeSpecRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyNodeSpecRequest setNodeStorage(Integer nodeStorage) {
        this.nodeStorage = nodeStorage;
        return this;
    }
    public Integer getNodeStorage() {
        return this.nodeStorage;
    }

    public ModifyNodeSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyNodeSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNodeSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNodeSpecRequest setReadonlyReplicas(Integer readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public Integer getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public ModifyNodeSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNodeSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNodeSpecRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyNodeSpecRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
