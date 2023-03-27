// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupRequest extends TeaModel {
    /**
     * <p>The description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of disk N for which you want to create snapshots. You can specify multiple disk IDs across instances with the same zone. Valid values of N: 1 to 16. A single snapshot-consistent group can contain snapshots of up to 16 disks and cannot exceed 32 TiB in size.</p>
     * <br>
     * <p>When you call this operation, take note of the following items:</p>
     * <br>
     * <p>*   You cannot specify both DiskId.N and `ExcludeDiskId.N`.</p>
     * <p>*   If `InstanceId` is specified, DiskId.N is only used to specify the disks that are attached to the instance specified by InstanceId.</p>
     */
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The ID of disk N for which you do not need to create snapshots. After this parameter is specified, the created snapshot-consistent group does not contain snapshots of the disk. Valid values of N: 1 to 16.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that snapshots are created for all the disks of the instance.</p>
     * <br>
     * <p>> You cannot specify both ExcludeDiskId.N and `DiskId.N`.</p>
     */
    @NameInMap("ExcludeDiskId")
    public java.util.List<String> excludeDiskId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable the instant access feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the instant access feature.</p>
     * <p>*   false: disables the instant access feature.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("InstantAccess")
    public Boolean instantAccess;

    /**
     * <p>Specify the number of days for which the instant access feature is available. Unit: days. Valid values: 1 to 65535.</p>
     * <br>
     * <p>This parameter takes effect only when `InstantAccess` is set to true. The instant access feature is automatically disabled when the specified duration of the instant access feature expires.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the expiration time of the instant access feature is determined by the time when the snapshots are released.</p>
     */
    @NameInMap("InstantAccessRetentionDays")
    public Integer instantAccessRetentionDays;

    /**
     * <p>The name of the snapshot-consistent group. The name must be 2 to 128 characters in length, and contain letters, digits, periods (.), underscores (\_), hyphens (-), and colons (:). It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>> This parameter is unavailable.</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The tags to add to the snapshot-consistent group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSnapshotGroupRequestTag> tag;

    public static CreateSnapshotGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupRequest self = new CreateSnapshotGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSnapshotGroupRequest setDiskId(java.util.List<String> diskId) {
        this.diskId = diskId;
        return this;
    }
    public java.util.List<String> getDiskId() {
        return this.diskId;
    }

    public CreateSnapshotGroupRequest setExcludeDiskId(java.util.List<String> excludeDiskId) {
        this.excludeDiskId = excludeDiskId;
        return this;
    }
    public java.util.List<String> getExcludeDiskId() {
        return this.excludeDiskId;
    }

    public CreateSnapshotGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSnapshotGroupRequest setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    public CreateSnapshotGroupRequest setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
        this.instantAccessRetentionDays = instantAccessRetentionDays;
        return this;
    }
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    public CreateSnapshotGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSnapshotGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSnapshotGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSnapshotGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSnapshotGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSnapshotGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSnapshotGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSnapshotGroupRequest setStorageLocationArn(String storageLocationArn) {
        this.storageLocationArn = storageLocationArn;
        return this;
    }
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    public CreateSnapshotGroupRequest setTag(java.util.List<CreateSnapshotGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSnapshotGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateSnapshotGroupRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the snapshot-consistent group. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the snapshot-consistent group. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSnapshotGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSnapshotGroupRequestTag self = new CreateSnapshotGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSnapshotGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSnapshotGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
