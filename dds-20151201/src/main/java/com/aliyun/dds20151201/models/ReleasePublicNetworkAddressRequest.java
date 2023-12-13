// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleasePublicNetworkAddressRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A sharded cluster instance consists of three components: mongos, shard, and Configserver.</p>
     * <br>
     * <p>> * This parameter is valid only if you set the **DBInstanceId** parameter to the ID of a sharded cluster instance.</p>
     * <p>> * You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the ID of the mongos, shard, or Configserver node.</p>
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

    public static ReleasePublicNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicNetworkAddressRequest self = new ReleasePublicNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicNetworkAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ReleasePublicNetworkAddressRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ReleasePublicNetworkAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleasePublicNetworkAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleasePublicNetworkAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleasePublicNetworkAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
