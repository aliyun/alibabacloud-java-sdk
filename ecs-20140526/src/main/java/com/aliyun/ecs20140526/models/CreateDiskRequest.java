// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is left empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The category of the disk. Valid values:</p>
     * <br>
     * <p>*   cloud: basic disk</p>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <p>*   cloud_ssd: standard SSD</p>
     * <p>*   cloud_essd: ESSD</p>
     * <br>
     * <p>Default value: cloud.</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The disk name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is left empty by default.</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the instance to which the created subscription disk is automatically attached.</p>
     * <br>
     * <p>*   After you specify the instance ID, ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId are ignored.</p>
     * <p>*   You cannot specify ZoneId and InstanceId at the same time.</p>
     * <br>
     * <p>This parameter is empty by default. This indicates that a pay-as-you-go disk is created. The RegionId and ZoneId parameters specify where the disk resides.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key that you want to use for the disk.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach feature for the disk. Valid values:</p>
     * <br>
     * <p>*   Disabled.</p>
     * <p>*   Enabled. Set the value to `Enabled` only for ESSDs.</p>
     * <br>
     * <p>Default value: Disabled.</p>
     * <br>
     * <p>> Disks for which the multi-attach feature is enabled support only the pay-as-you-go billing method. When `MultiAttach` is set to Enabled, you cannot specify `InstanceId`. You can call the [AttachDisk](~~25515~~) operation to attach disks to instances after the disks are created. Disks for which the multi-attach feature is enabled can be attached only as data disks.</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The performance level of the ESSD. Valid values:</p>
     * <br>
     * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
     * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL1.</p>
     * <br>
     * <p>For more information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The ID of the region in which to create the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the disk.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The size of the disk. Unit: GiB. This parameter is required. Valid values:</p>
     * <br>
     * <p>*   Valid values when DiskCategory is set to cloud: 5 to 2,000</p>
     * <br>
     * <p>*   Valid values when DiskCategory is set to cloud_efficiency: 20 to 32,768</p>
     * <br>
     * <p>*   Valid values when DiskCategory is set to cloud_ssd: 20 to 32,768</p>
     * <br>
     * <p>*   Valid values when DiskCategory is set to cloud_essd: depends on the `PerformanceLevel` value.</p>
     * <br>
     * <p>    *   Valid values when PerformanceLevel is set to PL0: 40 to 32,768</p>
     * <p>    *   Valid values when PerformanceLevel is set to PL1: 20 to 32,768</p>
     * <p>    *   Valid values when PerformanceLevel is set to PL2: 461 to 32,768</p>
     * <p>    *   Valid values when PerformanceLevel is set to PL3: 1,261 to 32,768</p>
     * <br>
     * <p>If the `SnapshotId` parameter is specified, the following limits apply to the `SnapshotId` and `Size` parameters:</p>
     * <br>
     * <p>*   If the size of the snapshot specified by the `SnapshotId` parameter is greater than the specified `Size` value, the size of the created disk is equal to the specified snapshot size.</p>
     * <p>*   If the size of the snapshot specified by the `SnapshotId` parameter is smaller than the specified `Size` value, the size of the created disk is equal to the specified `Size` value.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the snapshot that you want to use to create the disk. Snapshots that were created on or before July 15, 2013 cannot be used to create disks.</p>
     * <br>
     * <p>The following limits apply to the `SnapshotId` and `Size` parameters:</p>
     * <br>
     * <p>*   If the size of the snapshot specified by the `SnapshotId` parameter is greater than the specified `Size` value, the size of the created disk is equal to the specified snapshot size.</p>
     * <p>*   If the size of the snapshot specified by the `SnapshotId` parameter is smaller than the specified `Size` value, the size of the created disk is equal to the specified `Size` value.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the dedicated block storage cluster. To create a disk in a specific dedicated block storage cluster, specify this parameter. For more information about dedicated block storage clusters, see [What is Dedicated Block Storage Cluster?](~~208883~~)</p>
     * <br>
     * <p>> You cannot specify storage set-related parameters (`StorageSetId` and `StorageSetPartitionNumber`) and the dedicated block storage cluster-related parameter (`StorageClusterId`) at the same time.</p>
     */
    @NameInMap("StorageClusterId")
    public String storageClusterId;

    /**
     * <p>The ID of the storage set.</p>
     * <br>
     * <p>> You cannot specify storage set-related parameters (`StorageSetId` and `StorageSetPartitionNumber`) and the dedicated block storage cluster-related parameter (`StorageClusterId`) at the same time.</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The number of partitions in the storage set. The value must be greater than or equal to 2 but cannot exceed the quota obtained by calling the [DescribeAccountAttributes](~~73772~~) operation.</p>
     * <br>
     * <p>Default value: 2.</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tags to add to the disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    /**
     * <p>The ID of the zone in which to create the pay-as-you-go disk.</p>
     * <br>
     * <p>*   If you do not specify InstanceId, you must specify ZoneId.</p>
     * <p>*   You cannot specify ZoneId and InstanceId at the same time.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskRequest self = new CreateDiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskRequest setAdvancedFeatures(String advancedFeatures) {
        this.advancedFeatures = advancedFeatures;
        return this;
    }
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    public CreateDiskRequest setArn(java.util.List<CreateDiskRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CreateDiskRequestArn> getArn() {
        return this.arn;
    }

    public CreateDiskRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CreateDiskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDiskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiskRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateDiskRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public CreateDiskRequest setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public CreateDiskRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDiskRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public CreateDiskRequest setMultiAttach(String multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }
    public String getMultiAttach() {
        return this.multiAttach;
    }

    public CreateDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDiskRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CreateDiskRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CreateDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDiskRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public CreateDiskRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateDiskRequest setStorageClusterId(String storageClusterId) {
        this.storageClusterId = storageClusterId;
        return this;
    }
    public String getStorageClusterId() {
        return this.storageClusterId;
    }

    public CreateDiskRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateDiskRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateDiskRequest setTag(java.util.List<CreateDiskRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDiskRequestTag> getTag() {
        return this.tag;
    }

    public CreateDiskRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDiskRequestArn extends TeaModel {
        /**
         * <p>This parameter is not publicly available.</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>This parameter is not publicly available.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>This parameter is not publicly available.</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateDiskRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskRequestArn self = new CreateDiskRequestArn();
            return TeaModel.build(map, self);
        }

        public CreateDiskRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateDiskRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateDiskRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateDiskRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:`. The tag value cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDiskRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskRequestTag self = new CreateDiskRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDiskRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDiskRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
