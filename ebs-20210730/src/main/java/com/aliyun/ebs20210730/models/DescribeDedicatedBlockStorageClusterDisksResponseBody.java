// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksResponseBody extends TeaModel {
    /**
     * <p>The collection of cloud disk information.</p>
     */
    @NameInMap("Disks")
    public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks disks;

    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedBlockStorageClusterDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClusterDisksResponseBody self = new DescribeDedicatedBlockStorageClusterDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClusterDisksResponseBody setDisks(DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks getDisks() {
        return this.disks;
    }

    public DescribeDedicatedBlockStorageClusterDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClusterDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags self = new DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk extends TeaModel {
        /**
         * <p>The time when the cloud disk was last attached. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T06:08:56Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BdfId")
        public String bdfId;

        /**
         * <p>Indicates whether the burst (performance burst) feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the cloud disk or local disk is cloud_essd, which indicates an ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether automatic snapshots are deleted when the cloud disk is released. Valid values:</p>
         * <ul>
         * <li>true: Automatic snapshots are deleted when the cloud disk is released.</li>
         * <li>false: Automatic snapshots are retained when the cloud disk is released.</li>
         * </ul>
         * <p>Snapshots created by calling <a href="https://help.aliyun.com/document_detail/25524.html">CreateSnapshot</a> or by using the console are not affected by this parameter and are always retained.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        /**
         * <p>Indicates whether the cloud disk is released when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: The cloud disk is released when the instance is released.</li>
         * <li>false: The cloud disk is retained when the instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The cloud disk description.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the cloud disk was last detached.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T21:01:22Z</p>
         */
        @NameInMap("DetachedTime")
        public String detachedTime;

        /**
         * <p>The device name of the instance to which the cloud disk is attached, such as /dev/xvdb. Note the following items:</p>
         * <ul>
         * <li><p>This parameter has a value only when the <code>Status</code> parameter is set to <code>In_use</code>. This parameter is empty in other states.</p>
         * </li>
         * <li><p>For cloud disks with the multi-attach feature enabled, this value is always empty. You can view all attachment information of the cloud disk from the returned <code>Attachment</code> list.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter will be deprecated. To ensure code compatibility, do not use this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the cloud disk. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The cloud disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the automatic snapshot policy feature is enabled for the cloud disk.</p>
         * <blockquote>
         * <p>This parameter is deprecated. After a cloud disk is created, the automatic snapshot policy feature is enabled by default. You only need to associate an automatic snapshot policy with the cloud disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        /**
         * <p>Indicates whether the cloud disk is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The maximum number of read/write (I/O) operations per second. Unit: operations/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("IOPS")
        public Long IOPS;

        /**
         * <p>The ID of the image used to create the ECS instance. This parameter has a value only for cloud disks created from an image. Otherwise, this value is empty. This value remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp13aqm171qynt3u***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance ID of the instance to which the cloud disk is mounted. Note the following items:</p>
         * <ul>
         * <li><p>This parameter has a value only when the <code>Status</code> parameter is set to <code>In_use</code>. This parameter is empty in other states.</p>
         * </li>
         * <li><p>For cloud disks with the multi-attach attribute enabled, this value is always empty. You can view all mount information of the cloud disk from the returned <code>Attachment</code> list.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4q****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The KMS key ID used by the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The number of instances to which the shared storage is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        /**
         * <p>Indicates whether the multi-attach feature is enabled for the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("MultiAttach")
        public String multiAttach;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: a maximum of 10,000 random read/write IOPS per cloud disk.</li>
         * <li>PL1: a maximum of 50,000 random read/write IOPS per cloud disk.</li>
         * <li>PL2: a maximum of 100,000 random read/write IOPS per cloud disk.</li>
         * <li>PL3: a maximum of 1,000,000 random read/write IOPS per cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>Indicates whether the cloud disk is removable.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Portable")
        public Boolean portable;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The region ID of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cloud disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create the cloud disk.</p>
         * <p>If no snapshot was specified when the cloud disk was created, this value is empty. This value remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The cloud disk status. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Cloud disk status</a>. Valid values:</p>
         * <ul>
         * <li>In_use.</li>
         * <li>Available.</li>
         * <li>Attaching.</li>
         * <li>Detaching.</li>
         * <li>Creating.</li>
         * <li>ReIniting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>In_use</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the dedicated block storage cluster to which the cloud disk belongs. If the cloud disk belongs to a public cloud block storage cluster, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        /**
         * <p>The storage set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-i-bp1j4i2jdf3owlhe****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The maximum number of partitions in the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The tags of the cloud disk.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags> tags;

        /**
         * <p>The amount of data that can be transferred per unit of time. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The type of the cloud disk. Valid values:</p>
         * <ul>
         * <li>system: system cloud disk.</li>
         * <li>data: data cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk self = new DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setIOPS(Long IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Long getIOPS() {
            return this.IOPS;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setMultiAttach(String multiAttach) {
            this.multiAttach = multiAttach;
            return this;
        }
        public String getMultiAttach() {
            return this.multiAttach;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setTags(java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags> getTags() {
            return this.tags;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setThroughput(Long throughput) {
            this.throughput = throughput;
            return this;
        }
        public Long getThroughput() {
            return this.throughput;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks extends TeaModel {
        /**
         * <p>The collection of cloud disk information.</p>
         */
        @NameInMap("Disk")
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk> disk;

        public static DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks self = new DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks setDisk(java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
