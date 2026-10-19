// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocateNodePrivateNetworkAddressRequest extends TeaModel {
    /**
     * <p>The username.</p>
     * <blockquote>
     * <ul>
     * <li>The username must start with a lowercase letter and be 4 to 16 characters in length. It can contain lowercase letters, digits, and underscores (_).</li>
     * <li>You need to set the username and password only when you apply for an endpoint for a shard or Configserver node for the first time. All shard and Configserver nodes use the username and password set during the first application.</li>
     * <li>The account has fixed read-only permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>shardcsaccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>!#$%^&amp;*()_+-=</code>.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The instance ID of the sharded cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1fa5efaa93****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the shard or Configserver node.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to query the ID of the shard or Configserver node.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp124beeb0ac****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to query the zone ID of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AllocateNodePrivateNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateNodePrivateNetworkAddressRequest self = new AllocateNodePrivateNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateNodePrivateNetworkAddressRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AllocateNodePrivateNetworkAddressRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public AllocateNodePrivateNetworkAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AllocateNodePrivateNetworkAddressRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AllocateNodePrivateNetworkAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateNodePrivateNetworkAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateNodePrivateNetworkAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateNodePrivateNetworkAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateNodePrivateNetworkAddressRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
