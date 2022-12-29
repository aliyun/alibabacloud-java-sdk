// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    // The username of the account. The username must meet the following requirements:
    // 
    // * The username starts with a lowercase letter.
    // * The username contains lowercase letters, digits, and underscores (\_).
    // * The username is 4 to 16 characters in length.
    // 
    // > * Keywords cannot be used as account usernames.
    // > * The permissions of this account are fixed at read-only.
    // > * The username and password are required to be set only when you apply for an endpoint for the shard node for the first time.
    @NameInMap("AccountName")
    public String accountName;

    // The password of the account. The password must meet the following requirements:
    // 
    // * The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters.
    // * These special characters include ! @ # $ % ^ & \* ( ) \_ + - =
    // * The password is 8 to 32 characters in length.
    // 
    // >  The account password of the shard node cannot be reset.
    @NameInMap("AccountPassword")
    public String accountPassword;

    // Specifies whether to enable automatic payment. Default value: true. Valid values:
    // 
    // *   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.
    // *   **false**: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose **Expenses** > **Orders**. On the **Orders** page, find the order and complete the payment.********
    // 
    // >  This parameter is required when the billing method of the instance is subscription.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The business information. This is an additional parameter.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The coupon code. Default value: **youhuiquan\_promotion\_option\_id\_for\_blank**.
    @NameInMap("CouponNo")
    public String couponNo;

    // The ID of the sharded cluster instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The specifications of the shard or mongos node. For more information, see [Instance types](~~57141~~).
    @NameInMap("NodeClass")
    public String nodeClass;

    // The disk capacity of the node. Unit: GB.
    // 
    // Valid values: **10** to **2000**. The value must be a multiple of 10. Unit: GB.
    // 
    // >  This parameter is required if the NodeType parameter is set to **shard**.
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    // The type of the node. Valid values:
    // 
    // *   **shard**: shard node
    // *   **mongos**: mongos node
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of read-only nodes in the shard node.
    // 
    // Valid values: **0** to **5**. The value must be an integer. Default value: **0**.
    // 
    // >  This parameter is available only for ApsaraDB for MongoDB instances that are purchased on the China site (aliyun.com).
    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // Specifies whether to apply for an endpoint for the shard node. Default value: false. Valid values:
    // 
    // *   **true**: applies for an endpoint for the shard node.
    // *   **false** : does not apply for an endpoint for the shard node.
    @NameInMap("ShardDirect")
    public Boolean shardDirect;

    public static CreateNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeRequest self = new CreateNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateNodeRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNodeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNodeRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateNodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateNodeRequest setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }
    public String getNodeClass() {
        return this.nodeClass;
    }

    public CreateNodeRequest setNodeStorage(Integer nodeStorage) {
        this.nodeStorage = nodeStorage;
        return this;
    }
    public Integer getNodeStorage() {
        return this.nodeStorage;
    }

    public CreateNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNodeRequest setReadonlyReplicas(Integer readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public Integer getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public CreateNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateNodeRequest setShardDirect(Boolean shardDirect) {
        this.shardDirect = shardDirect;
        return this;
    }
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

}
