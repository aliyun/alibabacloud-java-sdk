// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    /**
     * <p>The username. Valid values:</p>
     * <ul>
     * <li>The username must start with a lowercase letter.</li>
     * <li>The username can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The username must be 4 to 16 characters in length.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB for MongoDB does not support keywords as usernames.</li>
     * <li>The permissions of the account are fixed to read-only.</li>
     * <li>When you apply for a direct connection endpoint for the shard node for the first time, you must set the username and password. You do not need to set them again for subsequent applications.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password. Valid values:</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB for MongoDB does not support resetting the password for the shard node account.</p>
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
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account has sufficient balance.
     * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, choose <strong>Subscription Orders</strong> &gt; <strong>My Orders</strong> in the left-side navigation pane, and then pay for the order on the <strong>Orders</strong> tab.
     * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, click <strong>Order Management</strong> in the left-side navigation pane, and then pay for the order on the <strong>Orders</strong> page.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the billing method is subscription.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional parameter for business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The value can contain a maximum of 64 ASCII characters and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong> (default): uses a coupon.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance ID of the sharded cluster instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp11501cd7b5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without calling the operation. The system checks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false (default): sends the request. If the request passes the dry run, the operation is performed.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance type of the shard or mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.shard.mid</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <p>The disk space of the node. Unit: GB.</p>
     * <p>The valid values vary based on the storage type. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
     * <blockquote>
     * <p>This parameter is required when the node type is <strong>shard</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>shard</strong>: shard node.</li>
     * <li><strong>mongos</strong>: mongos node.</li>
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
     * <p>Valid values: <strong>0</strong> to <strong>5</strong>. Default value: <strong>0</strong>.</p>
     * <blockquote>
     * <p>This parameter is supported only on the China site.</p>
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
     * <p>The instance type of the search node to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>mdb.shard.4x.large.d</p>
     */
    @NameInMap("SearchDBInstanceClass")
    public String searchDBInstanceClass;

    /**
     * <p>The number of search nodes to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SearchNodeCount")
    public Integer searchNodeCount;

    /**
     * <p>The storage capacity of the search node to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SearchStorage")
    public Integer searchStorage;

    /**
     * <p>Specifies whether to apply for a direct connection endpoint for the shard node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: applies for a direct connection endpoint for the shard node.</li>
     * <li><strong>false</strong> (default): does not apply for a direct connection endpoint for the shard node.</li>
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

    public CreateNodeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public CreateNodeRequest setSearchDBInstanceClass(String searchDBInstanceClass) {
        this.searchDBInstanceClass = searchDBInstanceClass;
        return this;
    }
    public String getSearchDBInstanceClass() {
        return this.searchDBInstanceClass;
    }

    public CreateNodeRequest setSearchNodeCount(Integer searchNodeCount) {
        this.searchNodeCount = searchNodeCount;
        return this;
    }
    public Integer getSearchNodeCount() {
        return this.searchNodeCount;
    }

    public CreateNodeRequest setSearchStorage(Integer searchStorage) {
        this.searchStorage = searchStorage;
        return this;
    }
    public Integer getSearchStorage() {
        return this.searchStorage;
    }

    public CreateNodeRequest setShardDirect(Boolean shardDirect) {
        this.shardDirect = shardDirect;
        return this;
    }
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

}
