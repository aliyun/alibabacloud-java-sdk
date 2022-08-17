// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksResponseBody extends TeaModel {
    @NameInMap("Disks")
    public DescribeDedicatedBlockStorageClusterDisksResponseBodyDisks disks;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("BdfId")
        public String bdfId;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("DetachedTime")
        public String detachedTime;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskChargeType")
        public String diskChargeType;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("IOPS")
        public Long IOPS;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        @NameInMap("MultiAttach")
        public String multiAttach;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClusterId")
        public String storageClusterId;

        @NameInMap("StorageSetId")
        public String storageSetId;

        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("Tags")
        public java.util.List<DescribeDedicatedBlockStorageClusterDisksResponseBodyDisksDiskTags> tags;

        @NameInMap("Type")
        public String type;

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
