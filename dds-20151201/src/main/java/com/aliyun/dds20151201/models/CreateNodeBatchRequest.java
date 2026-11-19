// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchRequest extends TeaModel {
    /**
     * <p>The username of the account. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a lowercase letter.</li>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must be 4 to 16 characters in length.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB for MongoDB does not support using keywords as account names.</li>
     * <li>The permissions of the account are fixed to read-only.</li>
     * <li>When you apply for a direct connection endpoint for a shard node for the first time, you must set the account name and password. You do not need to set them again for subsequent applications.</li>
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
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB for MongoDB does not support resetting the password of the account for a shard node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PassWord123</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables automatic payment. Make sure that your account has sufficient balance. This is the default value.</li>
     * <li><strong>false</strong>: Disables automatic payment. You must manually pay the order. For more information, see <a href="https://help.aliyun.com/document_detail/85052.html">Manually renew a subscription instance</a>.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. It cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong>: Uses a coupon. This is the default value.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: Does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp18b0934e70****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: Performs a dry run without calling the operation. The system checks items such as request parameters, request format, service limits, and inventory. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
     * <li>false: Sends the request. If the check succeeds, the operation is performed. This is the default value.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The source of the request. Valid values:</p>
     * <ul>
     * <li><strong>OpenApi</strong>: The request is sent from OpenAPI Explorer.</li>
     * <li><strong>mongo_buy</strong>: The request is sent from the console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OpenApi</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The specifications of the Mongos or shard nodes to be added. For more information about the specifications, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.</p>
     * <blockquote>
     * <p>By default, a sharded cluster instance supports up to 32 Mongos nodes and 32 shard nodes.</p>
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
     * <p>Specifies whether to apply for a direct connection endpoint for the shard node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Applies for a direct connection endpoint for the shard node.</li>
     * <li><strong>false</strong>: Does not apply for a direct connection endpoint for the shard node. This is the default value.</li>
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

    public CreateNodeBatchRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
