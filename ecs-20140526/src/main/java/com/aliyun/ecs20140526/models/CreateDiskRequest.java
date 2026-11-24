// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    /**
     * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The disk description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - standard edition.</li>
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
     * <p>The disk name. The name must be 2 to 128 characters in length and can contain Unicode letters (including English and Chinese characters) and ASCII digits (0-9). It can contain colons (:), underscores (_), periods (.), and hyphens (-). It must start with a Unicode letter.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the subscription instance to which the disk is automatically attached. Specify this parameter to create a subscription disk and attach it to the specified subscription instance.</p>
     * <ul>
     * <li>After you specify the instance ID, the <code>ResourceGroupId</code>, <code>Tag.N.Key</code>, <code>Tag.N.Value</code>, <code>ClientToken</code>, and <code>KMSKeyId</code> parameters are ignored.</li>
     * <li>You cannot specify both <code>ZoneId</code> and <code>InstanceId</code>.</li>
     * </ul>
     * <p>Default value: empty. An empty value indicates that a pay-as-you-go disk is created. The region and zone of the disk are determined by the <code>RegionId</code> and <code>ZoneId</code> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18pnlg1ds9rky4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used to encrypt the disk.</p>
     * <blockquote>
     * <p>If <code>Encrypted</code> is set to true and <code>KMSKeyId</code> is not specified, the default key is used for encryption, and the <code>KMSKeyId</code> value is returned after the disk is created.</p>
     * <ul>
     * <li><ul>
     * <li>If the disk is created from an unshared encrypted snapshot, the encryption key used for the snapshot is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created from a shared encrypted snapshot, the service key is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created in a region where account-level default encryption for Block Storage is enabled, the specified account-level key is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>In other cases, the service key is used by default.</li>
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
     * <p>Specifies whether to enable the multi-attach feature. Valid values:</p>
     * <ul>
     * <li>Disabled: disables the feature.</li>
     * <li>Enabled: enables the feature. Only enterprise SSDs support this feature (standard SSDs do not).</li>
     * </ul>
     * <p>Default value: Disabled.</p>
     * <blockquote>
     * <p>Disks with the multi-attach feature enabled support only the pay-as-you-go billing method. Therefore, when <code>MultiAttach</code> is set to <code>Enabled</code>, you cannot specify the <code>InstanceId</code> parameter. You can call <a href="https://help.aliyun.com/document_detail/25515.html">AttachDisk</a> to attach the disk after it is created. Note that disks with the multi-attach feature enabled can only be attached as data disks.</p>
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
     * <p>The performance level of the enterprise SSD (standard SSDs do not support this parameter). Valid values:</p>
     * <ul>
     * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <p>For more information about how to select an enterprise SSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">enterprise SSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read and write IOPS for a single ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li><p>If the disk size is less than or equal to 3 GiB, you cannot configure provisioned performance.</p>
     * </li>
     * <li><p>If the disk size is greater than or equal to 4 GiB: 0 to min{(1,000 IOPS/GiB × disk size - baseline IOPS), 50,000}.</p>
     * </li>
     * </ul>
     * <p>The baseline performance is calculated as follows: max{min{1,800 + 50 × disk size, 50,000}, 3,000}.</p>
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
     * <p>The access mode of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>ReadOnly</p>
     */
    @NameInMap("ReadWriteMode")
    public String readWriteMode;

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
     * <p>The disk size. Unit: GiB. You must specify this parameter. Valid values:</p>
     * <ul>
     * <li>cloud: 5 to 2,000.</li>
     * <li>cloud_efficiency: 20 to 32,768.</li>
     * <li>cloud_ssd: 20 to 32,768.</li>
     * <li>cloud_essd: The valid values vary based on the <code>PerformanceLevel</code> parameter.<ul>
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
     * <p>If you specify the <code>SnapshotId</code> parameter, the <code>SnapshotId</code> and <code>Size</code> parameters have the following limits:</p>
     * <ul>
     * <li>If the snapshot size is greater than the <code>Size</code> value, the created disk size is equal to the snapshot size.</li>
     * <li>If the snapshot size is less than the <code>Size</code> value, the created disk size is equal to the <code>Size</code> value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the snapshot used to create the disk. Snapshots created on or before July 15, 2013 cannot be used to create disks. </p>
     * <p>The <code>SnapshotId</code> and <code>Size</code> parameters have the following limits:</p>
     * <ul>
     * <li>If the snapshot size is greater than the <code>Size</code> value, the created disk size is equal to the snapshot size.</li>
     * <li>If the snapshot size is less than the <code>Size</code> value, the created disk size is equal to the <code>Size</code> value.</li>
     * <li>You cannot use snapshots to create elastic ephemeral disks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the dedicated block storage cluster. Specify this parameter to create a disk in a specific dedicated block storage cluster.</p>
     * <blockquote>
     * <p>You can specify only one of the storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>). If you specify both, the API call fails.</p>
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
     * <p>You can specify only one of the storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>). If you specify both, the API call fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The number of partitions in the storage set. Valid values: greater than or equal to 2. The maximum value cannot exceed the privilege quota limit displayed after you call <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a>.</p>
     * <p>Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tags of the disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    /**
     * <p>The zone ID of the pay-as-you-go disk.</p>
     * <ul>
     * <li>If you do not specify <code>InstanceId</code>, <code>ZoneId</code> is required.</li>
     * <li>You cannot specify both <code>ZoneId</code> and <code>InstanceId</code>.</li>
     * </ul>
     * <blockquote>
     * <p>You do not need to specify <code>ZoneId</code> for disks of the <code>cloud_regional_disk_auto</code> type.</p>
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

    public CreateDiskRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
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
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
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
         * <p>The tag key of the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the disk. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
