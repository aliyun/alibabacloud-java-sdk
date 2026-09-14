// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    /**
     * <p>The snapshot type. Valid values:</p>
     * <ul>
     * <li>Standard: normal snapshot.</li>
     * <li>Flash: local snapshot.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is being deprecated. Standard snapshots for ESSD disks have been upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration is required and no additional fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The snapshot description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to enable the snapshot instant access feature. Valid values:</p>
     * <ul>
     * <li>true: enables the feature. Only ESSD disks support this feature.</li>
     * <li>false: disables the feature. A normal snapshot is created.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Standard snapshots for ESSD disks have been upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration is required and no additional fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InstantAccess")
    public Boolean instantAccess;

    /**
     * <p>Settings for the retention period of the snapshot instant access feature. The snapshot undergoes automatic release when the retention period expires. This parameter takes effect only when <code>InstantAccess</code> is set to <code>true</code>. Unit: days. Valid values: 1 to 65535.</p>
     * <p>Default value: the same as the value of the <code>RetentionDays</code> parameter.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Standard snapshots for ESSD disks have been upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration is required and no additional fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstantAccessRetentionDays")
    public Integer instantAccessRetentionDays;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group to which the snapshot belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Settings for the retention period of the snapshot, in days. Valid values: 1 to 65536. The snapshot undergoes automatic release when the retention period expires.</p>
     * <p>Default value: empty, which indicates that the snapshot does not undergo automatic release.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The snapshot name. The name must be 2 to 128 characters in length, must start with an uppercase or lowercase letter or a Chinese character, and can contain Unicode characters in the letter category (including English and Chinese characters) and ASCII digits (0–9). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * <blockquote>
     * <p>The name cannot start with http:// or https://. To avoid conflicts with automatic snapshot names, the name cannot start with <code>auto</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <blockquote>
     * <p>This parameter is not available for use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The list of tags.</p>
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
         * <p>The tag key of the snapshot. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
