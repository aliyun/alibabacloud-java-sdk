// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    /**
     * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The retention period of the snapshot. Valid values: 1 to 65536. Unit: days. The snapshot is automatically released when its retention period expires.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the snapshot is not automatically released.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud disk ID.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Creates a snapshot for a disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique across requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.** For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("InstantAccess")
    public Boolean instantAccess;

    /**
     * <p>The ID of the resource group to which to assign the snapshot.</p>
     */
    @NameInMap("InstantAccessRetentionDays")
    public Integer instantAccessRetentionDays;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The snapshot type. Valid values:</p>
     * <br>
     * <p>*   Standard: normal snapshot</p>
     * <p>*   Flash: local snapshot</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the `InstantAccess` parameter to ensure future compatibility. This parameter and the `InstantAccess` parameter cannot be specified at the same time. For more information, see the "Description" section of this topic.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The snapshot name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>The name cannot start with `auto` because snapshots whose names start with auto are recognized as automatic snapshots.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The local snapshot feature is replaced by the instant access feature. Parameter description:</p>
     * <br>
     * <p>*   If you used the local snapshot feature before December 14, 2020, you can use the `Category` or `InstantAccess` parameter as expected and must take note of the following items:</p>
     * <br>
     * <p>    *   The `Category` and `InstantAccess` parameters cannot be specified at the same time.</p>
     * <p>    *   If neither the `Category` nor `InstantAccess` parameters is specified, normal snapshots are created.</p>
     * <br>
     * <p>*   If you did not use the local snapshot feature before December 14, 2020, you can use the `InstantAccess` parameter but cannot use the `Category` parameter.</p>
     * <br>
     * <p>You cannot create snapshots for a disk in the following scenarios:</p>
     * <br>
     * <p>*   The number of manual snapshots of the disk has reached 256.</p>
     * <p>*   A snapshot is being created for the disk.</p>
     * <p>*   The instance to which the disk is attached has never been started.</p>
     * <p>*   The ECS instance to which the disk is attached is not in the **Stopped** or **Running** state.````</p>
     * <p>*   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instance is locked for security reasons. No operations are allowed on the instance.</p>
     * <br>
     * <p>When you create a snapshot, take note of the following items:</p>
     * <br>
     * <p>*   If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the [CreateImage](~~25535~~) operation.</p>
     * <p>*   When a snapshot is being created for a disk that is attached to an instance, do not change the instance state.</p>
     * <p>*   You can create snapshots for a disk that is in the **Expired** state.`` If the release time scheduled for a disk arrives while a snapshot is being created for the disk, the snapshot is in the **Creating** state and is deleted when the disk is released.``</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The value of tag N that you want to add to the snapshot. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or contain [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>Specifies whether to enable the instant access feature. Valid values:</p>
     * <br>
     * <p>*   true: enables the instant access feature. This feature can be enabled only for enhanced SSDs (ESSDs).</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**After the instant access feature is enabled, an instant access (IA) snapshot is created and can be used to roll back disks or create disks across zones even when the snapshot is being created. This feature ensures that a new ESSD snapshot is available for use as soon as possible regardless of its size.</p>
     * <br>
     * <p>*   false: does not enable the instant access feature. If InstantAccess is set to false, a normal snapshot is created.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>> This parameter and the `Category` parameter cannot be specified at the same time. For more information, see the "Description" section of this topic.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSnapshotRequestTag> tag;

    public static CreateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotRequest self = new CreateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateSnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSnapshotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSnapshotRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateSnapshotRequest setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    public CreateSnapshotRequest setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
        this.instantAccessRetentionDays = instantAccessRetentionDays;
        return this;
    }
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    public CreateSnapshotRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSnapshotRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSnapshotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSnapshotRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public CreateSnapshotRequest setStorageLocationArn(String storageLocationArn) {
        this.storageLocationArn = storageLocationArn;
        return this;
    }
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    public CreateSnapshotRequest setTag(java.util.List<CreateSnapshotRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSnapshotRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateSnapshotRequestTag extends TeaModel {
        /**
         * <p>The tags to add to the snapshot.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag key to add to the snapshot.</p>
         * <br>
         * <p>> This parameter will be deprecated in the future. We recommend that you use the Tag.N.key parameter to ensure future compatibility.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSnapshotRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSnapshotRequestTag self = new CreateSnapshotRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSnapshotRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSnapshotRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
