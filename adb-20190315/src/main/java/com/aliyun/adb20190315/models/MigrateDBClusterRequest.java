// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class MigrateDBClusterRequest extends TeaModel {
    /**
     * <p>The amount of reserved computing resources.
     * Valid values: 0ACU to 4096ACU. Step size: 16. Each AnalyticDB compute unit (ACU) is approximately equal to 1 core and 4 GB memory.</p>
     * 
     * <strong>example:</strong>
     * <p>32ACU</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ProductForm")
    public String productForm;

    @NameInMap("ProductVersion")
    public String productVersion;

    @NameInMap("ReservedNodeCount")
    public Integer reservedNodeCount;

    @NameInMap("ReservedNodeSize")
    public String reservedNodeSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecondaryVSwitchId")
    public String secondaryVSwitchId;

    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The number of shards that you want to change during the data migration.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ShardNumber")
    public String shardNumber;

    /**
     * <p>The amount of reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of the number of ACUs specified by the StorageResourceSize parameter × 3 (default value: 24ACU). Each ACU is approximately equal to 1 core and 4 GB memory.</p>
     * <blockquote>
     * <p> This parameter must be specified with a unit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24ACU</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    /**
     * <p>The node specifications of reserved storage resources. Valid values: 8ACU, 12ACU, and 16ACU.</p>
     * 
     * <strong>example:</strong>
     * <p>8ACU</p>
     */
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

    public MigrateDBClusterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public MigrateDBClusterRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public MigrateDBClusterRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public MigrateDBClusterRequest setReservedNodeCount(Integer reservedNodeCount) {
        this.reservedNodeCount = reservedNodeCount;
        return this;
    }
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    public MigrateDBClusterRequest setReservedNodeSize(String reservedNodeSize) {
        this.reservedNodeSize = reservedNodeSize;
        return this;
    }
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
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

    public MigrateDBClusterRequest setSecondaryVSwitchId(String secondaryVSwitchId) {
        this.secondaryVSwitchId = secondaryVSwitchId;
        return this;
    }
    public String getSecondaryVSwitchId() {
        return this.secondaryVSwitchId;
    }

    public MigrateDBClusterRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
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
