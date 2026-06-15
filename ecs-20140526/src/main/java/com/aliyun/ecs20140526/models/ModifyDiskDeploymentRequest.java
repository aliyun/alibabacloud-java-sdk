// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentRequest extends TeaModel {
    /**
     * <p>The new category of the disk. This parameter is valid only when you migrate a disk between different dedicated block storage clusters. The only valid value is <code>cloud_essd</code> (ESSD disk).</p>
     * <p>Default value: An empty string. If you leave this parameter empty, the category of the disk remains unchanged.</p>
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
     * <li><p><code>true</code>: Performs a dry run. The system checks the request for required parameters, format, service limits, and inventory. The system returns an error if the check fails, or the <code>DryRunOperation</code> error code if the check succeeds.</p>
     * </li>
     * <li><p><code>false</code>: Sends the request. If the request passes the check, the system returns a 2xx HTTP status code and migrates the disk.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
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
     * <p>The new performance level of the ESSD disk. This parameter is valid only when you migrate a disk between different dedicated block storage clusters. Valid values:</p>
     * <ul>
     * <li><p><code>PL0</code>: A maximum of 10,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><code>PL1</code>: A maximum of 50,000 random read/write IOPS per disk.</p>
     * </li>
     * </ul>
     * <p>Default value: An empty string. If you leave this parameter empty, the performance level of the disk remains unchanged.</p>
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
     * <p>The ID of the dedicated block storage cluster.</p>
     * <ul>
     * <li><p>To migrate the disk to a dedicated block storage cluster, specify <code>StorageClusterId</code>.</p>
     * </li>
     * <li><p>To migrate the disk to a public cloud block storage cluster, leave <code>StorageClusterId</code> empty.</p>
     * </li>
     * </ul>
     * <p>Default value: An empty string. If you leave this parameter empty, the disk is migrated to a public cloud block storage cluster.</p>
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
