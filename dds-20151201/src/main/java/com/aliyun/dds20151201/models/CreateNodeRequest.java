// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    /**
     * <p>The username of the account. The username must meet the following requirements:</p>
     * <ul>
     * <li>The username starts with a lowercase letter.</li>
     * <li>The username can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The username must be 4 to 16 characters in length.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Keywords cannot be used as accounts.</p>
     * </li>
     * <li><p>This account is granted the read-only permissions.</p>
     * </li>
     * <li><p>The username and password need to be set if you apply for an endpoint for the shard node for the first time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must meet the following requirements:</p>
     * <ul>
     * <li>The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>These special characters include ! @ # $ % ^ &amp; \* ( ) _ + - =</li>
     * <li>The password is 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p> ApsaraDB for MongoDB does not allow you to reset the password of an account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123+abc</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that you have sufficient balance within your account.</li>
     * <li><strong>false</strong>: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; Orders. On the <strong>Orders</strong> page, find the order that you want to pay for and complete the payment.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required only when the billing method of the instance is subscription.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information. This is an additional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The coupon code. Default value: <strong>youhuiquan_promotion_option_id_for_blank</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the sharded cluster instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp11501cd7b5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance type of the shard or mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.shard.mid</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <p>The disk capacity of the node. Unit: GB.</p>
     * <p>Valid values: <strong>10</strong> to <strong>2000</strong>. The value must be a multiple of 10.</p>
     * <blockquote>
     * <p> This parameter is required only when the NodeType parameter is set to <strong>shard</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li><strong>shard</strong>: shard node</li>
     * <li><strong>mongos</strong>: mongos node</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shard</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes in the shard node.</p>
     * <p>Valid values: <strong>0</strong>, 1, 2, 3, 4, and <strong>5</strong>. Default value: <strong>0</strong>.</p>
     * <blockquote>
     * <p> This parameter is available only for ApsaraDB for MongoDB instances that are purchased on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to apply for an endpoint for the shard node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: applies for an endpoint for the shard node.</li>
     * <li><strong>false</strong> (default): does not apply for an endpoint for the shard node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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

    public CreateNodeRequest setShardDirect(Boolean shardDirect) {
        this.shardDirect = shardDirect;
        return this;
    }
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

}
