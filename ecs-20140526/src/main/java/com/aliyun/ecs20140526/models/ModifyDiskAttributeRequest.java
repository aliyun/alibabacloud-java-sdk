// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeRequest extends TeaModel {
    /**
     * <p>是否开启Burst（性能突发）。取值范围：</p>
     * <br>
     * <p>- true：是。</p>
     * <p>- false：否。</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether to delete the automatic snapshots of the disk when the disk is released. This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether to release the disk along with its associated instance. This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     * <br>
     * <p>An error is returned if you set this parameter to false in the following cases:</p>
     * <br>
     * <p>*   Category is set to ephemeral.</p>
     * <p>*   Category is set to cloud and Portable is set to false.</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The description of the disk. It must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the disk.</p>
     * <br>
     * <p>>  You can specify `DiskId` or `DiskIds.N`, but you cannot specify both of them.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>待修改明细的多个磁盘ID。N的取值范围为0 ~ 100。</p>
     * <p>> `DiskId`和`DiskIds.N`两个参数不能同时被调用，请您根据需求任选其一传值。</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to enable the automatic snapshot policy feature for the disk.</p>
     * <br>
     * <p>*   true: enables the automatic snapshot policy feature for the disk.</p>
     * <p>*   false: disables the automatic snapshot policy feature for the disk.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the current value remains unchanged.</p>
     * <br>
     * <p>>  By default, the automatic snapshot policy feature is enabled for created disks. You need only to apply an automatic snapshot policy to a disk before you can use the policy.</p>
     */
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDiskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeRequest self = new ModifyDiskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskAttributeRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyDiskAttributeRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public ModifyDiskAttributeRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public ModifyDiskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskAttributeRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyDiskAttributeRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public ModifyDiskAttributeRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public ModifyDiskAttributeRequest setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
        this.enableAutoSnapshot = enableAutoSnapshot;
        return this;
    }
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public ModifyDiskAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDiskAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDiskAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDiskAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
