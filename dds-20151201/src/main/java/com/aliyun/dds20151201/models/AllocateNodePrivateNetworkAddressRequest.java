// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocateNodePrivateNetworkAddressRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * <br>
     * <p>> * The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (\_). It must start with a lowercase letter.</p>
     * <p>> * You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.</p>
     * <p>> * The permissions of this account are fixed to read-only.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account.</p>
     * <br>
     * <p>*   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&*()_+-=`</p>
     * <p>*   The password must be 8 to 32 characters in length.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The ID of the sharded cluster instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the shard or Configserver node.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the ID of the shard or Configserver node.</p>
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
     * <br>
     * <p>>  You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the zone ID of the instance.</p>
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
