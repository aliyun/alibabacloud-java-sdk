// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchRequest extends TeaModel {
    /**
     * <p>The username of the account. The username must meet the following requirements:</p>
     * <ul>
     * <li><p>The username starts with a lowercase letter.</p>
     * </li>
     * <li><p>The username contains lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>The username is 4 to 16 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Keywords cannot be used as account usernames.</p>
     * </li>
     * <li><p>The permissions of this account are fixed at read-only.</p>
     * </li>
     * <li><p>The username and password are required to be set only when you apply for an endpoint for the shard node for the first time.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters.</p>
     * </li>
     * <li><p>These special characters include ! @ # $ % ^ &amp; \* ( ) _ + - =</p>
     * </li>
     * <li><p>The password is 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The account password of the shard node cannot be reset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PassWord123</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables automatic payment. Make sure that you have sufficient balance within your account.</p>
     * </li>
     * <li><p><strong>false</strong>: disables automatic payment. In this case, you must manually pay for the instance. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; <strong>Orders</strong>. On the Orders page, find the order and complete the payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use coupons. Default value: null. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong> or <strong>null</strong>: uses coupons.</p>
     * </li>
     * <li><p><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use coupons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the instance for which you want to add nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp18b0934e70****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The source of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>OpenApi</strong>: ApsaraDB for MongoDB API</p>
     * </li>
     * <li><p><strong>mongo_buy</strong>: ApsaraDB for MongoDB console</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OpenApi</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The specifications of the mongos or shard node that you want to add. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * <blockquote>
     * <p>Up to 32 mongos or shard nodes are supported for each sharded cluster instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Shards&quot;:[{&quot;DBInstanceClass&quot;:&quot;mdb.shard.4x.large.d&quot;,&quot;Storage&quot;:20}]}</p>
     */
    @NameInMap("NodesInfo")
    public String nodesInfo;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to apply for an endpoint for the shard node. Default value: false. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: applies for an endpoint for the shard node.</p>
     * </li>
     * <li><p><strong>false</strong>: does not apply for an endpoint for the shard node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShardDirect")
    public Boolean shardDirect;

    public static CreateNodeBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeBatchRequest self = new CreateNodeBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeBatchRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateNodeBatchRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateNodeBatchRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNodeBatchRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateNodeBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNodeBatchRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateNodeBatchRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateNodeBatchRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateNodeBatchRequest setNodesInfo(String nodesInfo) {
        this.nodesInfo = nodesInfo;
        return this;
    }
    public String getNodesInfo() {
        return this.nodesInfo;
    }

    public CreateNodeBatchRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNodeBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNodeBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNodeBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNodeBatchRequest setShardDirect(Boolean shardDirect) {
        this.shardDirect = shardDirect;
        return this;
    }
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

}
