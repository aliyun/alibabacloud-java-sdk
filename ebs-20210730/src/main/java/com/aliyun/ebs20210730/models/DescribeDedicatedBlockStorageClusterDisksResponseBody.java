// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksResponseBody extends TeaModel {
    /**
     * <p>Details about the cloud disks.</p>
     */
    @NameInMap("Disks")
    public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks disks;

    /**
     * <p>The query token returned in this call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The tag key of the cloud disk.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the cloud disk.</p>
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
         * <p>The time when the cloud disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>This parameter is currently in invitational preview and unavailable for general users.</p>
         */
        @NameInMap("BdfId")
        public String bdfId;

        /**
         * <p>Whether the ESSD AutoPL disk is enabled burst IOPS / BPS. This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~).</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the disk. A value of cloud_essd indicates that the disk is an ESSD.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether the automatic snapshots of the cloud disk are deleted when the disk is released. Valid values:</p>
         * <br>
         * <p>*   true: The automatic snapshots of the cloud disk are deleted when the disk is released.</p>
         * <p>*   false: The automatic snapshots of the cloud disk are retained when the disk is released.</p>
         * <br>
         * <p>Snapshots that are created by calling the [CreateSnapshot](~~25524~~) operation or by using the Elastic Compute Service (ECS) console are retained and not affected by this parameter.</p>
         */
        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        /**
         * <p>Indicates whether the cloud disk is released when its associated instance is released. Valid values:</p>
         * <br>
         * <p>*   true: The cloud disk is released when its associated instance is released.</p>
         * <p>*   false: The cloud disk is retained when its associated instance is released.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the cloud disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the cloud disk was last detached.</p>
         */
        @NameInMap("DetachedTime")
        public String detachedTime;

        /**
         * <p>The device name of the cloud disk on its associated instance. Example: /dev/xvdb. Take note of the following items:</p>
         * <br>
         * <p>*   This parameter has a value only when the `Status` value is `In_use`.</p>
         * <p>*   This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the cloud disk based on the `Attachment` values.</p>
         * <br>
         * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the cloud disk. Valid values:</p>
         * <br>
         * <p>*   PrePaid: subscription</p>
         * <p>*   PostPaid: pay-as-you-go</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The ID of the cloud disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the cloud disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the automatic snapshot policy feature is enabled for the cloud disk.</p>
         */
        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        /**
         * <p>Indicates whether the cloud disk is encrypted.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The maximum number of IOPS.</p>
         */
        @NameInMap("IOPS")
        public Long IOPS;

        /**
         * <p>The ID of the image that was used to create the instance. This parameter is empty unless the cloud disk was created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the instance to which the cloud disk is attached. Take note of the following items:</p>
         * <br>
         * <p>*   This parameter has a value only when the `Status` value is `In_use`.</p>
         * <p>*   This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the cloud disk based on the `Attachment` values.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the Key Management Service (KMS) key used by the cloud disk.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The number of instances to which the Shared Block Storage device is attached.</p>
         */
        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        /**
         * <p>Indicates whether the multi-attach feature was enabled for the cloud disk.</p>
         */
        @NameInMap("MultiAttach")
        public String multiAttach;

        /**
         * <p>The performance level of the enhanced SSD (ESSD). Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>Indicates whether the cloud disk is removable.</p>
         */
        @NameInMap("Portable")
        public Boolean portable;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. </p>
         * <p>>  This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The region ID of cloud disk.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that was used to create the cloud disk.</p>
         * <br>
         * <p>This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The state of the cloud disk. For more information, see [Disk states](~~25689~~). Valid values:</p>
         * <br>
         * <p>*   In_use</p>
         * <p>*   Available</p>
         * <p>*   Attaching</p>
         * <p>*   Detaching</p>
         * <p>*   Creating</p>
         * <p>*   ReIniting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        /**
         * <p>The ID of the storage set.</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The maximum number of partitions in the storage set.</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The tags of the cloud disk.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags> tags;

        /**
         * <p>The maximum number of BPS.</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <br>
         * <p>*   system: system disk</p>
         * <p>*   data: data disk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID of cloud disk.</p>
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
         * <p>Details about the cloud disks.</p>
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
