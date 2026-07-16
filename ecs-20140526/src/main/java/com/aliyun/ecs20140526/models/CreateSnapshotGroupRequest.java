// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of a disk for which you want to create a snapshot-consistent group. You can specify disk IDs across instances within the same zone. Valid values of N: 1 to 16. A snapshot-consistent group can contain up to 16 disks with a total capacity of up to 32 TiB.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This parameter cannot be specified together with <code>ExcludeDiskId.N</code>.</li>
     * <li>If you specify <code>InstanceId</code>, this parameter can only be set to disks attached to the specified instance and no longer supports specifying disk IDs across multiple instances.</li>
     * </ul>
     */
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The ID of a disk in the instance for which you do not want to create a snapshot. After you specify this parameter, the snapshot-consistent group does not contain the snapshot of the specified disk. Valid values of N: 1 to 16.</p>
     * <p>Default value: null, which indicates that snapshots are created for all disks in the instance.</p>
     * <blockquote>
     * <p>This parameter cannot be specified together with <code>DiskId.N</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-j6cf7l0ewidb78lq****</p>
     */
    @NameInMap("ExcludeDiskId")
    public java.util.List<String> excludeDiskId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-j6ca469urv8ei629****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable snapshot instant access. Valid values:</p>
     * <ul>
     * <li>true: enables snapshot instant access.</li>
     * <li>false: disables snapshot instant access.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Standard snapshots of enterprise SSDs are upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration or fees are required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InstantAccess")
    public Boolean instantAccess;

    /**
     * <p>The number of days for which the snapshot instant access feature remains active. Unit: days. Valid values: 1 to 65535.</p>
     * <p>This parameter takes effect only when <code>InstantAccess=true</code>. The snapshot instant access feature is automatically shutdown when the specified duration expires.</p>
     * <p>Default value: null, which indicates that the instant access duration is the same as the snapshot release period.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Standard snapshots of enterprise SSDs are upgraded to <a href="https://help.aliyun.com/document_detail/193667.html">instant access by default</a>. No additional configuration or fees are required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstantAccessRetentionDays")
    public Integer instantAccessRetentionDays;

    /**
     * <p>The name of the snapshot-consistent group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, periods (.), underscores (_), hyphens (-), and colons (:).</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
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
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSnapshotGroupRequestTag> tag;

    public static CreateSnapshotGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupRequest self = new CreateSnapshotGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
         * <p>The tag key of the snapshot-consistent group. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot-consistent group. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
