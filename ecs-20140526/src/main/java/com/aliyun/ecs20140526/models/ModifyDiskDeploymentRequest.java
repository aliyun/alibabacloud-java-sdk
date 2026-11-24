// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentRequest extends TeaModel {
    /**
     * <p>The new disk type. This parameter is valid only during disk migration between different dedicated block storage clusters. Only cloud_essd (ESSD) is supported.</p>
     * <p>Default value: empty, which indicates that the disk type is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp131n0q38u3a4zi****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without executing the request. The system checks whether required parameters are specified, the request format is valid, service limits are met, and ECS resources are sufficient. If the request fails the check, the corresponding error is returned. If the request passes the check, the DryRunOperation error code is returned.</li>
     * <li>false: executes the request. If the request passes the check, a 2xx HTTP status code is returned and the disk is migrated.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new ESSD performance level. This parameter is valid only during disk migration between different dedicated block storage clusters. Valid values:</p>
     * <ul>
     * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: empty, which indicates that the performance level is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the dedicated block storage cluster. Before you migrate a disk into a dedicated block storage cluster, you must purchase and create the cluster, and ensure that the disk and the destination cluster are in the same zone.</p>
     * <ul>
     * <li>To migrate a disk to a dedicated block storage cluster, you must specify <code>StorageClusterId</code>.</li>
     * <li>To migrate a disk to a public cloud block storage cluster, you must leave <code>StorageClusterId</code> empty.</li>
     * </ul>
     * <p>Default value: empty, which indicates that the disk is migrated to a public cloud block storage cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsc-cn-c4d2uea****</p>
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
