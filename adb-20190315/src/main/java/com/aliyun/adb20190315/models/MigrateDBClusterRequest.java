// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class MigrateDBClusterRequest extends TeaModel {
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ShardNumber")
    public String shardNumber;

    @NameInMap("StorageResource")
    public String storageResource;

    @NameInMap("StorageResourceSize")
    public String storageResourceSize;

    public static MigrateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBClusterRequest self = new MigrateDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDBClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public MigrateDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public MigrateDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateDBClusterRequest setShardNumber(String shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }
    public String getShardNumber() {
        return this.shardNumber;
    }

    public MigrateDBClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
    }

    public MigrateDBClusterRequest setStorageResourceSize(String storageResourceSize) {
        this.storageResourceSize = storageResourceSize;
        return this;
    }
    public String getStorageResourceSize() {
        return this.storageResourceSize;
    }

}
