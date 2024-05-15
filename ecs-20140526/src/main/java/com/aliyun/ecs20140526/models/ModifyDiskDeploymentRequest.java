// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentRequest extends TeaModel {
    /**
     * <p>The new disk category. The parameter can be used only when you migrate a disk between dedicated block storage clusters. Only ESSDs can be created in dedicated block storage clusters. Set this parameter to cloud_essd.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the disk category is not changed.</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the disk.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and unavailable ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new performance level of the ESSD. The parameter can be used only when you migrate data between dedicated block storage clusters. Valid values:</p>
     * <br>
     * <p>*   PL0: A single ESSD can deliver up to 10000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50000 random read/write IOPS.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the performance level is not modified.</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     * <br>
     * <p>*   When you migrate a disk to a dedicated block storage cluster, the StorageClusterId parameter must be specified.</p>
     * <p>*   When you migrate a disk to a public block storage cluster, the StorageClusterId parameter must be left empty.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the disk is migrated to a public block storage cluster.</p>
     */
    @NameInMap("StorageClusterId")
    public String storageClusterId;

    public static ModifyDiskDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskDeploymentRequest self = new ModifyDiskDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskDeploymentRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public ModifyDiskDeploymentRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyDiskDeploymentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDiskDeploymentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDiskDeploymentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDiskDeploymentRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public ModifyDiskDeploymentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDiskDeploymentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDiskDeploymentRequest setStorageClusterId(String storageClusterId) {
        this.storageClusterId = storageClusterId;
        return this;
    }
    public String getStorageClusterId() {
        return this.storageClusterId;
    }

}
