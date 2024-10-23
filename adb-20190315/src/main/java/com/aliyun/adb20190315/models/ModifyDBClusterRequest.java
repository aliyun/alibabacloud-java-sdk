// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The computing resources of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/190632.html">DescribeAvailableResource</a> operation to query the computing resources that are available within a region.</p>
     * <blockquote>
     * <p>This parameter must be specified when Mode is set to Flexible.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32Core128GBNEW</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Cluster</strong>: reserved mode for Cluster Edition.</li>
     * <li><strong>MixedStorage</strong>: elastic mode for Cluster Edition.</li>
     * </ul>
     * <blockquote>
     * <p>If you set DBClusterCategory to Cluster, you must set Mode to Reserver. If you set DBClusterCategory to MixedStorage, you must set Mode to Flexible. Otherwise, you fail to change the specifications of the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MixedStorage</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1u8c0mgfg58****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node specifications of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>C8</strong></li>
     * <li><strong>C32</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when Mode is set to Reserver.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C32</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of node groups. Valid values: 1 to 200.</p>
     * <blockquote>
     * <p>This parameter must be specified when Mode is set to Reserver.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity per node. Unit: GB.</p>
     * <ul>
     * <li>Valid values when DBClusterClass is set to C8: 100 to 2000.</li>
     * <li>Valid values when DBClusterClass is set to C32: 100 to 8000.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified when Mode is set to Reserver.</p>
     * </li>
     * <li><p>The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The enhanced SSD (ESSD) performance level of the cluster. Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * <li>PL2</li>
     * <li>PL3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("DiskPerformanceLevel")
    public String diskPerformanceLevel;

    /**
     * <p>The number of EIUs. The number of EIUs that you can purchase varies based on the single-node EIU specifications.</p>
     * <ul>
     * <li>If the single-node EIU specifications are 8 cores and 64 GB, you can purchase up to 32 EIUs.</li>
     * <li>If the single-node EIU specifications are 12 cores and 96 GB, you can purchase up to 16 EIUs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ElasticIOResource")
    public Integer elasticIOResource;

    /**
     * <p>The single-node specifications of an elastic I/O unit (EIU). Valid values:</p>
     * <ul>
     * <li><strong>8Core64GB</strong>: If you set the parameter to <strong>8Core64GB</strong>, the specifications of an EIU are 24 cores and 192 GB memory.</li>
     * <li><strong>12Core96GB</strong>: If you set the parameter to <strong>12Core96GB</strong>, the specifications of an EIU are 36 cores and 288 GB memory.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when your cluster meets the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li><p>The cluster is in elastic mode.</p>
     * </li>
     * <li><p>If the cluster resides in the China (Guangzhou), China (Shenzhen), China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), or China (Zhangjiakou) region, the cluster has 16 cores and 64 GB memory or higher specifications.</p>
     * </li>
     * <li><p>If the cluster resides in another region, the cluster has 32 cores and 128 GB memory or higher specifications.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8Core64GB</p>
     */
    @NameInMap("ElasticIOResourceSize")
    public String elasticIOResourceSize;

    /**
     * <p>N/A</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ExecutorCount")
    public String executorCount;

    /**
     * <p>The mode of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Reserver</strong>: the reserved mode.</li>
     * <li><strong>Flexible</strong>: the elastic mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Flexible</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The change type. Valid values:</p>
     * <ul>
     * <li><strong>Upgrade</strong></li>
     * <li><strong>Downgrade</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>N/A</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
