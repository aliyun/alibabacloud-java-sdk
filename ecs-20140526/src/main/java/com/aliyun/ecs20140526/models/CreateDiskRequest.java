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
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    /**
     * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only if you set <code>DiskCategory</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is left empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The category of the data disk. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk</li>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: ESSD</li>
     * <li>cloud_auto: ESSD AutoPL disk</li>
     * <li>cloud_essd_entry: ESSD Entry disk</li>
     * <li>cloud_regional_disk_auto: Regional ESSD</li>
     * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
     * <li>elastic_ephemeral_disk_premium: premium elastic ephemeral disk</li>
     * </ul>
     * <p>Default value: cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The name must start with a letter.</p>
     * <p>This parameter is left empty by default.</p>
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
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the subscription instance to which to attach the subscription disk.</p>
     * <ul>
     * <li>If you specify an instance ID, the following parameters are ignored: ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId.</li>
     * <li>You cannot specify both ZoneId and InstanceId in a request.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that a pay-as-you-go disk is created in the region and zone specified by RegionId and ZoneId.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18pnlg1ds9rky4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key that is used for the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach feature for the disk. Valid values:</p>
     * <ul>
     * <li>Disabled</li>
     * <li>Enabled Set the value to <code>Enabled</code> only for ESSDs.</li>
     * </ul>
     * <p>Default value: Disabled.</p>
     * <blockquote>
     * <p> Disks for which the multi-attach feature is enabled support only the pay-as-you-go billing method. When <code>MultiAttach</code> is set to Enabled, you cannot specify <code>InstanceId</code>. You can call the <a href="https://help.aliyun.com/document_detail/25515.html">AttachDisk</a> operation to attach disks to instances after the disks are created. Disks for which the multi-attach feature is enabled can be attached only as data disks.</p>
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
     * <p>The performance level of the disk if the disk is an ESSD. Valid values:</p>
     * <ul>
     * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <p>For information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
     * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
     * <blockquote>
     * <p> This parameter is available only if you set <code>DiskCategory</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The ID of the region in which to create the disk. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to add the disk.</p>
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
     * <p>The size of the data disk. Unit: GiB. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p>Valid values when DiskCategory is set to cloud: 5 to 2000.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_efficiency: 20 to 32768.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_ssd: 20 to 32768.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_essd: vary based on the <code>PerformanceLevel</code> value.</p>
     * <ul>
     * <li>Valid values when PerformanceLevel is set to PL0: 1 to 65536.</li>
     * <li>Valid values when PerformanceLevel is set to PL1: 20 to 65536.</li>
     * <li>Valid values when PerformanceLevel is set to PL2: 461 to 65536.</li>
     * <li>Valid values when PerformanceLevel is set to PL3: 1261 to 65536.</li>
     * </ul>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_auto: 1 to 65536.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_essd_entry: 10 to 32768.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_regional_disk_auto: 10 to 65536.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to elastic_ephemeral_disk_standard: 64 to 8192.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to elastic_ephemeral_disk_premium: 64 to 8192.</p>
     * </li>
     * </ul>
     * <p>If you specify <code>SnapshotId</code>, the following limits apply to <code>SnapshotId</code> and <code>Size</code>:</p>
     * <ul>
     * <li>If the size of the snapshot specified by <code>SnapshotId</code> is larger than the value of <code>Size</code>, the size of the created disk is equal to the size of the snapshot.</li>
     * <li>If the size of the snapshot specified by <code>SnapshotId</code> is smaller than the value of <code>Size</code>, the size of the created disk is equal to the value of <code>Size</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the snapshot to use to create the disk. Snapshots that were created on or before July 15, 2013 cannot be used to create disks.</p>
     * <p>The following limits apply to <code>SnapshotId</code> and <code>Size</code>:</p>
     * <ul>
     * <li>If the size of the snapshot specified by <code>SnapshotId</code> is larger than the value of <code>Size</code>, the size of the created disk is equal to the specified snapshot size.</li>
     * <li>If the size of the snapshot specified by <code>SnapshotId</code> is smaller than the value of <code>Size</code>, the size of the created disk is equal to the value of <code>Size</code>.</li>
     * <li>You cannot create elastic ephemeral disks from snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the dedicated block storage cluster in which to create the disk. To create a disk in a specific dedicated block storage cluster, you must specify this parameter.</p>
     * <blockquote>
     * <p> You can specify the storage set-related parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) or the dedicated block storage cluster-related parameter (<code>StorageClusterId</code>), but not both. If you specify a storage set-related parameter and a dedicated block storage cluster-related parameter in a request, the request fails.</p>
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
     * <p>You cannot specify storage set-related parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster-related parameter (<code>StorageClusterId</code>) at the same time. Otherwise, the operation cannot be called.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The number of partitions in the storage set. The value must be greater than or equal to 2 but cannot exceed the quota obtained by calling the <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a>operation.</p>
     * <p>Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
     * <ul>
     * <li>If you do not specify InstanceId, you must specify ZoneId.</li>
     * <li>You cannot specify both ZoneId and InstanceId in the same request.</li>
     * </ul>
     * <blockquote>
     * <p> You do not need to specify this parameter if you set DiskCategory to <code>cloud_regional_disk_auto</code> to create a Regional ESSD.</p>
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
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
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
         * <p>The key of tag N to add to the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
