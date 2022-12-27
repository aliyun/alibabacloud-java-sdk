// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    // This parameter is unavailable.
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    // 该参数暂未开放使用。
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    // This parameter is unavailable.
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The description of the disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    // 
    // This parameter is empty by default.
    @NameInMap("Description")
    public String description;

    // The category of the data disk. Valid values:
    // 
    // *   cloud: basic disk
    // *   cloud_efficiency: ultra disk
    // *   cloud_ssd: standard SSD
    // *   cloud_essd: ESSD
    // 
    // Default value: cloud.
    @NameInMap("DiskCategory")
    public String diskCategory;

    // The name of the disk. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    // 
    // This parameter is empty by default.
    @NameInMap("DiskName")
    public String diskName;

    // This parameter is unavailable.
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    // Specifies whether to encrypt the disk. Valid values:
    // 
    // *   true: encrypts the disk.
    // *   false: does not encrypt the disk.
    // 
    // Default value: false.
    @NameInMap("Encrypted")
    public Boolean encrypted;

    // The ID of the instance to which the created subscription disk is automatically attached.
    // 
    // *   After you specify the instance ID, the specified ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId parameters are ignored.
    // *   You cannot specify ZoneId and InstanceId at the same time.
    // 
    // This parameter is empty by default. This indicates that a pay-as-you-go disk is created. The RegionId and ZoneId parameters specify where the disk resides.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the Key Management Service (KMS) key used by the disk.
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    // Specifies whether to enable the multi-attach feature for the disk. Valid values:
    // 
    // *   Disabled: disables the multi-attach feature.
    // *   Enabled: enables the multi-attach feature. Set the value to `Enabled` only for ESSDs.
    // 
    // Default value: Disabled.
    // 
    // >  Disks for which the multi-attach feature is enabled support only the pay-as-you-go billing method. When the `MultiAttach` parameter is set to Enabled, you cannot specify the `InstanceId` parameter. You can call the [AttachDisk](~~25515~~) operation to attach disks to instances after the disks are created. Disks for which the multi-attach feature is enabled can be attached only as data disks.
    @NameInMap("MultiAttach")
    public String multiAttach;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The performance level of the ESSD. Valid values:
    // 
    // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
    // *   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.
    // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
    // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
    // 
    // Default value: PL1.
    // 
    // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    // This parameter is unavailable.
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    // The ID of the region in which to create the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the disk.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The size of the disk. Unit: GiB. This parameter is required. Valid values:
    // 
    // *   Valid values when DiskCategory is set to cloud: 5 to 2,000
    // 
    // *   Valid values when DiskCategory is set to cloud_efficiency: 20 to 32,768
    // 
    // *   Valid values when DiskCategory is set to cloud_ssd: 20 to 32,768
    // 
    // *   Valid values when DiskCategory is set to cloud_essd: depends on the `PerformanceLevel` value.
    // 
    //     *   Valid values when PerformanceLevel is set to PL0: 40 to 32,768
    //     *   Valid values when PerformanceLevel is set to PL1: 20 to 32,768
    //     *   Valid values when PerformanceLevel is set to PL2: 461 to 32,768
    //     *   Valid values when PerformanceLevel is set to PL3: 1,261 to 32,768
    // 
    // If the `SnapshotId` parameter is specified, the following limits apply to the `SnapshotId` and `Size` parameters:
    // 
    // *   If the size of the snapshot specified by the `SnapshotId` parameter is greater than the specified `Size` value, the size of the created disk is equal to the specified snapshot size.
    // *   If the size of the snapshot specified by the `SnapshotId` parameter is smaller than the specified `Size` value, the size of the created disk is equal to the specified `Size` value.
    @NameInMap("Size")
    public Integer size;

    // The ID of the snapshot used to create the disk. Snapshots that were created on or before July 15, 2013 cannot be used to create disks.
    // 
    // The following limits apply to the `SnapshotId` and `Size` parameters:
    // 
    // *   If the size of the snapshot specified by the `SnapshotId` parameter is greater than the specified `Size` value, the size of the created disk is equal to the specified snapshot size.
    // *   If the size of the snapshot specified by the `SnapshotId` parameter is smaller than the specified `Size` value, the size of the created disk is equal to the specified `Size` value.
    @NameInMap("SnapshotId")
    public String snapshotId;

    // The ID of the dedicated block storage cluster. To create a disk in a specific dedicated block storage cluster, specify this parameter. For more information about dedicated block storage clusters, see [What is Dedicated Block Storage Cluster?](~~208883~~)
    // 
    // >  You can specify only one of the storage set-related parameters (`StorageSetId` and `StorageSetPartitionNumber`) and dedicated block storage cluster-related parameter (`StorageClusterId`). If you specify more than one of the preceding parameters, the call fails.
    @NameInMap("StorageClusterId")
    public String storageClusterId;

    // The ID of the storage set.
    // 
    // >  You can specify only one of the storage set-related parameters (`StorageSetId` and `StorageSetPartitionNumber`) and dedicated block storage cluster-related parameter (`StorageClusterId`). If you specify more than one of the preceding parameters, the call fails.
    @NameInMap("StorageSetId")
    public String storageSetId;

    // The number of partitions in the storage set. The value must be greater than or equal to 2, but cannot exceed the quota obtained by calling the [DescribeAccountAttributes](~~73772~~) operation.
    // 
    // Default value: 2.
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    // 云盘的标签信息列表。
    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    // The ID of the zone in which to create the pay-as-you-go disk.
    // 
    // *   If the InstanceId parameter is not specified, the ZoneId parameter is required.
    // *   You cannot specify ZoneId and InstanceId at the same time.
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
        // This parameter is unavailable.
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        // This parameter is unavailable.
        @NameInMap("RoleType")
        public String roleType;

        // This parameter is unavailable.
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
        // The key of tag N of the disk. Valid values of N: 1 to 20. The key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the disk. Valid values of N: 1 to 20. The value can be an empty string. It can be up to 128 characters in length. It cannot start with `acs:` or contain `http://` or `https://`.
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
