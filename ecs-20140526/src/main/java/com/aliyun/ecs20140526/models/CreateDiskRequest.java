// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    /**
     * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
     * <ul>
     * <li>true: enables the performance burst feature.</li>
     * <li>false: does not enable the performance burst feature.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The category of the data disk. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk.</li>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: enterprise SSD.</li>
     * <li>cloud_auto: ESSD AutoPL disk.</li>
     * <li>cloud_essd_entry: ESSD Entry disk.</li>
     * <li>cloud_regional_disk_auto: regional Enterprise SSD (ESSD).</li>
     * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard Edition.</li>
     * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
     * </ul>
     * <p>Default value: cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters in the Unicode character set (including English and Chinese characters) and ASCII digits (0-9). The name can contain colons (:), underscores (_), periods (.), or hyphens (-). The name must start with a letter in the Unicode character set.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <ul>
     * <li>true: encrypts the disk.</li>
     * <li>false: does not encrypt the disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the subscription instance to which the created subscription disk is automatically attached.</p>
     * <ul>
     * <li>After you specify the instance ID, the ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId parameters are ignored.</li>
     * <li>You cannot specify both ZoneId and InstanceId.</li>
     * </ul>
     * <p>Default value: empty. This indicates that a pay-as-you-go disk is created. The region of the disk is determined by RegionId and ZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18pnlg1ds9rky4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used by the disk.</p>
     * <blockquote>
     * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption. The KMSKeyId value is returned after the instance is created.</p>
     * <ul>
     * <li><ul>
     * <li>If the disk is created from a non-shared encrypted snapshot: the encryption key used by the snapshot is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created from a shared encrypted snapshot: the service key is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created in a region where account-level default encryption for block storage is enabled: the specified account-level key is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>In other cases: the service key is used by default.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach attribute. Valid values:</p>
     * <ul>
     * <li>Disabled: disables the multi-attach attribute.</li>
     * <li>Enabled: enables the multi-attach attribute. Only enterprise SSDs support this value.</li>
     * </ul>
     * <p>Default value: Disabled.</p>
     * <blockquote>
     * <p>Disks with the multi-attach attribute enabled support only the pay-as-you-go billing method. Therefore, when <code>MultiAttach=Enabled</code>, you cannot specify the <code>InstanceId</code> parameter. You can invoke <a href="https://help.aliyun.com/document_detail/25515.html">AttachDisk</a> to attach the disk after it is created. Note that a disk with the multi-attach feature enabled can be attached only as a data disk.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The performance level of the enterprise SSD. Valid values:</p>
     * <ul>
     * <li>PL0: a single disk can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: a single disk can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li><p>Capacity (GiB) &lt;= 3: provisioned performance is not supported.</p>
     * </li>
     * <li><p>Capacity (GiB) &gt;= 4: [0, min{(1,000 IOPS/GiB × Capacity - Baseline IOPS), 50,000}]</p>
     * </li>
     * </ul>
     * <p>Baseline performance = max{min{1,800 + 50 × Capacity, 50,000}, 3,000}.</p>
     * <blockquote>
     * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the disk belongs.</p>
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
     * <p>The size of the disk. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
     * <ul>
     * <li>cloud: 5 to 2,000.</li>
     * <li>cloud_efficiency: 20 to 32,768.</li>
     * <li>cloud_ssd: 20 to 32,768.</li>
     * <li>cloud_essd: The valid value range depends on the value of <code>PerformanceLevel</code>.<ul>
     * <li>PL0: 1 to 65,536.</li>
     * <li>PL1: 20 to 65,536.</li>
     * <li>PL2: 461 to 65,536.</li>
     * <li>PL3: 1,261 to 65,536.</li>
     * </ul>
     * </li>
     * <li>cloud_auto: 1 to 65,536.</li>
     * <li>cloud_essd_entry: 10 to 32,768.</li>
     * <li>cloud_regional_disk_auto: 10 to 65,536.</li>
     * <li>elastic_ephemeral_disk_standard: 64 to 8,192.</li>
     * <li>elastic_ephemeral_disk_premium: 64 to 8,192.</li>
     * </ul>
     * <p>If you specify <code>SnapshotId</code>, the <code>SnapshotId</code> and <code>Size</code> parameters have the following restrictions:</p>
     * <ul>
     * <li>If the snapshot specified by <code>SnapshotId</code> is larger than the specified <code>Size</code> value, the snapshot size of the created disk equals the size of the specified snapshot.</li>
     * <li>If the snapshot specified by <code>SnapshotId</code> is smaller than the specified <code>Size</code> value, the snapshot size of the created disk equals the specified <code>Size</code> value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the snapshot used to create the disk. Snapshots created on or before July 15, 2013 cannot be used to create disks. </p>
     * <p>The <code>SnapshotId</code> and <code>Size</code> parameters have the following restrictions:</p>
     * <ul>
     * <li>If the snapshot specified by <code>SnapshotId</code> is larger than the specified <code>Size</code> value, the snapshot size of the created disk equals the size of the specified snapshot.</li>
     * <li>If the snapshot specified by <code>SnapshotId</code> is smaller than the specified <code>Size</code> value, the snapshot size of the created disk equals the specified <code>Size</code> value.</li>
     * <li>Elastic ephemeral disks cannot be created from snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the dedicated block storage cluster. To create a disk in a specific dedicated block storage cluster, specify this parameter.</p>
     * <blockquote>
     * <p>The storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>) are mutually exclusive. If you specify both, the API call fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dbsc-j5e1sf2vaf5he8m2****</p>
     */
    @NameInMap("StorageClusterId")
    public String storageClusterId;

    /**
     * <p>The ID of the storage set.</p>
     * <blockquote>
     * <p>The storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>) are mutually exclusive. If you specify both, the API call fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The number of partitions in the storage set. Valid values: greater than or equal to 2, up to the privilege quota limit returned by <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a>.</p>
     * <p>Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The list of tags for the disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    /**
     * <p>The zone in which to create a pay-as-you-go disk.</p>
     * <ul>
     * <li>If you do not specify InstanceId, ZoneId is required.</li>
     * <li>You cannot specify both ZoneId and InstanceId.</li>
     * </ul>
     * <blockquote>
     * <p>Disks of the <code>cloud_regional_disk_auto</code> type do not require ZoneId to be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
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
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
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
         * <p>The tag key of the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
