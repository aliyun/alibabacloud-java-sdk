// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleaseNodePrivateNetworkAddressRequest extends TeaModel {
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The ID of the sharded cluster instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the internal endpoint. Valid values:</p>
     * <br>
     * <p>*   **VPC**: virtual private cloud (VPC).</p>
     * <p>*   **Classic**: classic network.</p>
     * <br>
     * <p>>  You can call the [DescribeShardingNetworkAddress](~~62135~~) operation to query the network type of the internal endpoint.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

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

    public static ReleaseNodePrivateNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseNodePrivateNetworkAddressRequest self = new ReleaseNodePrivateNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseNodePrivateNetworkAddressRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public ReleaseNodePrivateNetworkAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ReleaseNodePrivateNetworkAddressRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseNodePrivateNetworkAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseNodePrivateNetworkAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
