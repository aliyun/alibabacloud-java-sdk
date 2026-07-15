// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    /**
     * <p>The account name. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>Starts with a lowercase letter.</p>
     * </li>
     * <li><p>Consists of lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>Is 4 to 16 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Keywords of ApsaraDB for MongoDB cannot be used as the account name.</p>
     * </li>
     * <li><p>The account has read-only permissions.</p>
     * </li>
     * <li><p>You must set the account name and password only when you enable a public endpoint for a shard node for the first time. These parameters are not required on subsequent requests.</p>
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
     * <p>The password for the account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>Must contain characters from at least three of the following categories: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>Special characters include <code>!@#$%^&amp;*()_+-=</code>.</p>
     * </li>
     * <li><p>Is 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB for MongoDB does not support resetting the account password for shard nodes.</p>
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
     * <li><strong>true</strong>: (Default) Enables automatic payment. Ensure that your account has a sufficient balance.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>false</strong>: Disables automatic payment. In this case, you must manually pay for the node. To do so, log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Billing</strong> &gt; <strong>Billing Management</strong>. In the left-side navigation pane, choose <strong>Subscription Orders</strong> &gt; <strong>My Orders</strong>. On the <strong>Product Orders</strong> tab, find the order and complete the payment.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>false</strong>: Disables automatic payment. In this case, you must manually pay for the node. To do so, log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Billing</strong> &gt; <strong>Billing Management</strong>. In the left-side navigation pane, click <strong>Order Management</strong>. On the <strong>Product Orders</strong> page, find the order and complete the payment.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Additional business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>A client-generated token to ensure request idempotence. The token must be unique across requests, contain only ASCII characters, and not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong> or <strong>null</strong>: (Default) An available coupon is automatically applied.</p>
     * </li>
     * <li><p><strong>youhuiquan_promotion_option_id_for_blank</strong>: No coupon is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
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
     * <p>The instance type of the shard or mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.shard.mid</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <p>The storage space of the node. Unit: GB.</p>
     * <p>The valid values of this parameter vary based on the storage type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
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
     * <li><p><strong>shard</strong>: A shard node.</p>
     * </li>
     * <li><p><strong>mongos</strong>: A mongos node.</p>
     * </li>
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
     * <p>The number of read-only nodes in a shard node.</p>
     * <p>Valid values: <strong>0</strong> to <strong>5</strong>. The default value is <strong>0</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only on the China site (aliyun.com).</p>
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

    @NameInMap("SearchDBInstanceClass")
    public String searchDBInstanceClass;

    @NameInMap("SearchNodeCount")
    public Integer searchNodeCount;

    @NameInMap("SearchStorage")
    public Integer searchStorage;

    /**
     * <p>Specifies whether to enable a public endpoint for the shard node. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables a public endpoint for the shard node.</p>
     * </li>
     * <li><p><strong>false</strong>: (Default) Does not enable a public endpoint for the shard node.</p>
     * </li>
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
