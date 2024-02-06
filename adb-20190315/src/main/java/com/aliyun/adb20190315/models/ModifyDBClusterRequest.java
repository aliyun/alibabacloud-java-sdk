// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The computing resources of the cluster. You can call the [DescribeAvailableResource](~~190632~~) operation to query the computing resources that are available within a region.</p>
     * <br>
     * <p>> This parameter must be specified when Mode is set to Flexible.</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Cluster**: reserved mode for Cluster Edition.</p>
     * <p>*   **MixedStorage**: elastic mode for Cluster Edition.</p>
     * <br>
     * <p>> If you set DBClusterCategory to Cluster, you must set Mode to Reserver. If you set DBClusterCategory to MixedStorage, you must set Mode to Flexible. Otherwise, you fail to change the specifications of the cluster.</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node specifications of the cluster. Valid values:</p>
     * <br>
     * <p>*   **C8**</p>
     * <p>*   **C32**</p>
     * <br>
     * <p>> This parameter must be specified when Mode is set to Reserver.</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of node groups. Valid values: 1 to 200.</p>
     * <br>
     * <p>> This parameter must be specified when Mode is set to Reserver.</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity per node. Unit: GB.</p>
     * <br>
     * <p>*   Valid values when DBClusterClass is set to C8: 100 to 2000.</p>
     * <p>*   Valid values when DBClusterClass is set to C32: 100 to 8000.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when Mode is set to Reserver.</p>
     * <br>
     * <p>*   The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The enhanced SSD (ESSD) performance level of the cluster. Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     */
    @NameInMap("DiskPerformanceLevel")
    public String diskPerformanceLevel;

    /**
     * <p>The number of EIUs. The number of EIUs that you can purchase varies based on the single-node EIU specifications.</p>
     * <br>
     * <p>*   If the single-node EIU specifications are 8 cores and 64 GB, you can purchase up to 32 EIUs.</p>
     * <p>*   If the single-node EIU specifications are 12 cores and 96 GB, you can purchase up to 16 EIUs.</p>
     */
    @NameInMap("ElasticIOResource")
    public Integer elasticIOResource;

    /**
     * <p>The single-node specifications of an elastic I/O unit (EIU). Valid values:</p>
     * <br>
     * <p>*   **8Core64GB**: If you set the parameter to **8Core64GB**, the specifications of an EIU are 24 cores and 192 GB memory.</p>
     * <p>*   **12Core96GB**: If you set the parameter to **12Core96GB**, the specifications of an EIU are 36 cores and 288 GB memory.</p>
     * <br>
     * <p>>  This parameter takes effect only when your cluster meets the following requirements:</p>
     * <br>
     * <p>*   The cluster is in elastic mode.</p>
     * <br>
     * <p>*   If the cluster resides in the China (Guangzhou), China (Shenzhen), China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), or China (Zhangjiakou) region, the cluster has 16 cores and 64 GB memory or higher specifications.</p>
     * <br>
     * <p>*   If the cluster resides in another region, the cluster has 32 cores and 128 GB memory or higher specifications.</p>
     */
    @NameInMap("ElasticIOResourceSize")
    public String elasticIOResourceSize;

    /**
     * <p>N/A</p>
     */
    @NameInMap("ExecutorCount")
    public String executorCount;

    /**
     * <p>The mode of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Reserver**: the reserved mode.</p>
     * <p>*   **Flexible**: the elastic mode.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The change type. Valid values:</p>
     * <br>
     * <p>*   **Upgrade**</p>
     * <p>*   **Downgrade**</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster. You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>N/A</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    public static ModifyDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterRequest self = new ModifyDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public ModifyDBClusterRequest setDBClusterCategory(String DBClusterCategory) {
        this.DBClusterCategory = DBClusterCategory;
        return this;
    }
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    public ModifyDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public ModifyDBClusterRequest setDBNodeGroupCount(String DBNodeGroupCount) {
        this.DBNodeGroupCount = DBNodeGroupCount;
        return this;
    }
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    public ModifyDBClusterRequest setDBNodeStorage(String DBNodeStorage) {
        this.DBNodeStorage = DBNodeStorage;
        return this;
    }
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    public ModifyDBClusterRequest setDiskPerformanceLevel(String diskPerformanceLevel) {
        this.diskPerformanceLevel = diskPerformanceLevel;
        return this;
    }
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    public ModifyDBClusterRequest setElasticIOResource(Integer elasticIOResource) {
        this.elasticIOResource = elasticIOResource;
        return this;
    }
    public Integer getElasticIOResource() {
        return this.elasticIOResource;
    }

    public ModifyDBClusterRequest setElasticIOResourceSize(String elasticIOResourceSize) {
        this.elasticIOResourceSize = elasticIOResourceSize;
        return this;
    }
    public String getElasticIOResourceSize() {
        return this.elasticIOResourceSize;
    }

    public ModifyDBClusterRequest setExecutorCount(String executorCount) {
        this.executorCount = executorCount;
        return this;
    }
    public String getExecutorCount() {
        return this.executorCount;
    }

    public ModifyDBClusterRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyDBClusterRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
    }

}
