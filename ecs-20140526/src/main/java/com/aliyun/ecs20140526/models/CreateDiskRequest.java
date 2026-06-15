// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    /**
     * <p>This parameter is not yet available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    /**
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    /**
     * <p>Specifies whether to enable performance bursting. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for ESSD AutoPL disks (<code>cloud_auto</code>). For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>A client-generated, unique, case-sensitive token that you can use to ensure the idempotency of the request. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
     * <li><p><code>cloud</code>: basic disk</p>
     * </li>
     * <li><p><code>cloud_efficiency</code>: ultra disk</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: standard SSD</p>
     * </li>
     * <li><p><code>cloud_essd</code>: ESSD</p>
     * </li>
     * <li><p><code>cloud_auto</code>: ESSD AutoPL disk</p>
     * </li>
     * <li><p><code>cloud_essd_entry</code>: ESSD Entry disk</p>
     * </li>
     * <li><p><code>cloud_regional_disk_auto</code>: ESSD zone-redundant disk</p>
     * </li>
     * <li><p><code>elastic_ephemeral_disk_standard</code>: Elastic Ephemeral Disk - Standard</p>
     * </li>
     * <li><p><code>elastic_ephemeral_disk_premium</code>: Elastic Ephemeral Disk - Premium</p>
     * </li>
     * </ul>
     * <p>Default value: <code>cloud</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length. It must start with a letter as defined by Unicode and can contain letters (including English and Chinese characters), digits (0-9), colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>This parameter is not yet available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>Creates a subscription disk and automatically attaches it to the specified subscription instance.</p>
     * <ul>
     * <li><p>If you set this parameter, the <code>ResourceGroupId</code>, <code>Tag.N.Key</code>, <code>Tag.N.Value</code>, <code>ClientToken</code>, and <code>KMSKeyId</code> parameters are ignored.</p>
     * </li>
     * <li><p>You cannot specify both <code>ZoneId</code> and <code>InstanceId</code>.</p>
     * </li>
     * </ul>
     * <p>Default value: empty. An empty value indicates that you are creating a pay-as-you-go disk. The disk\&quot;s location is determined by <code>RegionId</code> and <code>ZoneId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18pnlg1ds9rky4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the KMS key to use for the disk.</p>
     * <blockquote>
     * <p>If <code>Encrypted</code> is set to true and you do not specify <code>KMSKeyId</code>, a default key is used for encryption. The <code>KMSKeyId</code> is returned in the response after the instance is created.</p>
     * <ul>
     * <li><ul>
     * <li>If the disk is created from an unshared encrypted snapshot, the encryption key used by that snapshot is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created from a shared encrypted snapshot, the service key is used by default.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the disk is created in a region with account-level default encryption enabled, the specified account-level key is used by default.</li>
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
     * <li><p>Disabled: The feature is disabled.</p>
     * </li>
     * <li><p>Enabled: The feature is enabled. Currently, only ESSDs support setting this parameter to <code>Enabled</code>.</p>
     * </li>
     * </ul>
     * <p>Default value: Disabled.</p>
     * <blockquote>
     * <p>Disks with the multi-attach feature enabled can only be billed on a pay-as-you-go basis. Therefore, you cannot set the <code>InstanceId</code> parameter when <code>MultiAttach</code> is <code>Enabled</code>. After you create the disk, you can call <a href="https://help.aliyun.com/document_detail/25515.html">AttachDisk</a> to attach it. Note that a multi-attach disk can be attached only as a data disk.</p>
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
     * <p>The performance level of the ESSD. Valid values:</p>
     * <ul>
     * <li><p>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</p>
     * </li>
     * <li><p>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</p>
     * </li>
     * <li><p>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</p>
     * </li>
     * <li><p>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</p>
     * </li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <p>For more information about how to choose an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of a single ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li><p>Capacity &lt;= 3 GiB: You cannot set provisioned performance.</p>
     * </li>
     * <li><p>Capacity &gt;= 4 GiB: 0 to min(1,000 IOPS/GiB × Capacity - Baseline IOPS, 50,000).</p>
     * </li>
     * </ul>
     * <p>Baseline IOPS = max(min(1,800 + 50 × Capacity, 50,000), 3,000).</p>
     * <blockquote>
     * <p>This parameter is available only for ESSD AutoPL disks (<code>cloud_auto</code>). For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The ID of the region in which to create the disk. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The capacity of the disk, in GiB. You must specify a value for this parameter. Value range:</p>
     * <ul>
     * <li><p><code>cloud</code>: 5 to 2,000</p>
     * </li>
     * <li><p><code>cloud_efficiency</code>: 20 to 32,768</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: 20 to 32,768</p>
     * </li>
     * <li><p><code>PerformanceLevel</code></p>
     * <ul>
     * <li><p>PL0: 1 to 65,536</p>
     * </li>
     * <li><p>PL1: 20 to 65,536</p>
     * </li>
     * <li><p>PL2: 461 to 65,536</p>
     * </li>
     * <li><p>PL3: 1,261 to 65,536</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>cloud_auto</code>: 1 to 65,536</p>
     * </li>
     * <li><p><code>cloud_essd_entry</code>: 10 to 32,768</p>
     * </li>
     * <li><p><code>cloud_regional_disk_auto</code>: 10 to 65,536</p>
     * </li>
     * <li><p><code>elastic_ephemeral_disk_standard</code>: 64 to 8,192</p>
     * </li>
     * <li><p><code>elastic_ephemeral_disk_premium</code>: 64 to 8,192</p>
     * </li>
     * </ul>
     * <p>If you specify <code>SnapshotId</code>, the following limits apply to <code>SnapshotId</code> and <code>Size</code>:</p>
     * <ul>
     * <li><p>If the snapshot capacity is greater than the specified <code>Size</code>, the actual disk size is the snapshot capacity.</p>
     * </li>
     * <li><p>If the snapshot capacity is smaller than the specified <code>Size</code>, the actual disk size is the specified <code>Size</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the snapshot used to create the disk. Snapshots created on or before July 15, 2013 cannot be used to create disks.</p>
     * <p>The <code>SnapshotId</code> and <code>Size</code> parameters have the following limits:</p>
     * <ul>
     * <li><p>If the snapshot capacity is greater than the specified <code>Size</code>, the actual disk size is the snapshot capacity.</p>
     * </li>
     * <li><p>If the snapshot capacity is smaller than the specified <code>Size</code>, the actual disk size is the specified <code>Size</code>.</p>
     * </li>
     * <li><p>You cannot use snapshots to create Elastic Ephemeral Disks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the dedicated block storage cluster. If you need to create a disk in a specific dedicated block storage cluster, specify this parameter.</p>
     * <blockquote>
     * <p>You can specify either storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) or the dedicated block storage cluster parameter (<code>StorageClusterId</code>), but not both. The request fails if you specify parameters for both.</p>
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
     * <p>You can specify either storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) or the dedicated block storage cluster parameter (<code>StorageClusterId</code>), but not both. The request fails if you specify parameters for both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The number of partitions in the storage set. The value must be greater than or equal to 2 and cannot exceed the quota returned by the <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a> operation.</p>
     * <p>Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>A list of tags for the disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    /**
     * <p>The ID of the zone in which to create the pay-as-you-go disk.</p>
     * <ul>
     * <li><p>If you do not set <code>InstanceId</code>, this parameter is required.</p>
     * </li>
     * <li><p>You cannot specify both <code>ZoneId</code> and <code>InstanceId</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>ESSD zone-redundant disks (<code>cloud_regional_disk_auto</code>) do not require a zone ID.</p>
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
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
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
         * <p>The tag key of the disk.</p>
         * <blockquote>
         * <p>For better code compatibility, we recommend that you use the <code>Tag.N.Key</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the disk. The value of N ranges from 1 to 20. If you specify <code>Tag.N.Value</code>, the value can be an empty string. The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
