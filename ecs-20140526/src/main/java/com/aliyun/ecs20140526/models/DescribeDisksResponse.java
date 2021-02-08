// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Disks")
    @Validation(required = true)
    public DescribeDisksResponseDisks disks;

    public static DescribeDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponse self = new DescribeDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDisksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksResponse setDisks(DescribeDisksResponseDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDisksResponseDisks getDisks() {
        return this.disks;
    }

    public static class DescribeDisksResponseDisksDiskOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeDisksResponseDisksDiskOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskOperationLocksOperationLock self = new DescribeDisksResponseDisksDiskOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDisksResponseDisksDiskOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDiskOperationLocksOperationLock> operationLock;

        public static DescribeDisksResponseDisksDiskOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskOperationLocks self = new DescribeDisksResponseDisksDiskOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskOperationLocks setOperationLock(java.util.List<DescribeDisksResponseDisksDiskOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDisksResponseDisksDiskOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDisksResponseDisksDiskMountInstancesMountInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("AttachedTime")
        @Validation(required = true)
        public String attachedTime;

        public static DescribeDisksResponseDisksDiskMountInstancesMountInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskMountInstancesMountInstance self = new DescribeDisksResponseDisksDiskMountInstancesMountInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskMountInstancesMountInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseDisksDiskMountInstancesMountInstance setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseDisksDiskMountInstancesMountInstance setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

    }

    public static class DescribeDisksResponseDisksDiskMountInstances extends TeaModel {
        @NameInMap("MountInstance")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDiskMountInstancesMountInstance> mountInstance;

        public static DescribeDisksResponseDisksDiskMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskMountInstances self = new DescribeDisksResponseDisksDiskMountInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskMountInstances setMountInstance(java.util.List<DescribeDisksResponseDisksDiskMountInstancesMountInstance> mountInstance) {
            this.mountInstance = mountInstance;
            return this;
        }
        public java.util.List<DescribeDisksResponseDisksDiskMountInstancesMountInstance> getMountInstance() {
            return this.mountInstance;
        }

    }

    public static class DescribeDisksResponseDisksDiskTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeDisksResponseDisksDiskTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskTagsTag self = new DescribeDisksResponseDisksDiskTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDisksResponseDisksDiskTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDisksResponseDisksDiskTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDiskTagsTag> tag;

        public static DescribeDisksResponseDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskTags self = new DescribeDisksResponseDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDiskTags setTag(java.util.List<DescribeDisksResponseDisksDiskTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDisksResponseDisksDiskTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDisksResponseDisksDisk extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("SourceSnapshotId")
        @Validation(required = true)
        public String sourceSnapshotId;

        @NameInMap("AutoSnapshotPolicyId")
        @Validation(required = true)
        public String autoSnapshotPolicyId;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("Portable")
        @Validation(required = true)
        public Boolean portable;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("DeleteWithInstance")
        @Validation(required = true)
        public Boolean deleteWithInstance;

        @NameInMap("DeleteAutoSnapshot")
        @Validation(required = true)
        public Boolean deleteAutoSnapshot;

        @NameInMap("EnableAutoSnapshot")
        @Validation(required = true)
        public Boolean enableAutoSnapshot;

        @NameInMap("EnableAutomatedSnapshotPolicy")
        @Validation(required = true)
        public Boolean enableAutomatedSnapshotPolicy;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("AttachedTime")
        @Validation(required = true)
        public String attachedTime;

        @NameInMap("DetachedTime")
        @Validation(required = true)
        public String detachedTime;

        @NameInMap("DiskChargeType")
        @Validation(required = true)
        public String diskChargeType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Encrypted")
        @Validation(required = true)
        public Boolean encrypted;

        @NameInMap("StorageSetId")
        @Validation(required = true)
        public String storageSetId;

        @NameInMap("StorageSetPartitionNumber")
        @Validation(required = true)
        public Integer storageSetPartitionNumber;

        @NameInMap("MountInstanceNum")
        @Validation(required = true)
        public Integer mountInstanceNum;

        @NameInMap("IOPS")
        @Validation(required = true)
        public Integer IOPS;

        @NameInMap("IOPSRead")
        @Validation(required = true)
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        @Validation(required = true)
        public Integer IOPSWrite;

        @NameInMap("KMSKeyId")
        @Validation(required = true)
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        @Validation(required = true)
        public String performanceLevel;

        @NameInMap("BdfId")
        @Validation(required = true)
        public String bdfId;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeDisksResponseDisksDiskOperationLocks operationLocks;

        @NameInMap("MountInstances")
        @Validation(required = true)
        public DescribeDisksResponseDisksDiskMountInstances mountInstances;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDisksResponseDisksDiskTags tags;

        public static DescribeDisksResponseDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDisk self = new DescribeDisksResponseDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDisksResponseDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseDisksDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDisksResponseDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseDisksDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseDisksDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDisksResponseDisksDisk setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDisksResponseDisksDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeDisksResponseDisksDisk setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDisksResponseDisksDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseDisksDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseDisksDisk setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseDisksDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseDisksDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDisksResponseDisksDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDisksResponseDisksDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDisksResponseDisksDisk setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        public DescribeDisksResponseDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseDisksDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseDisksDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseDisksDisk setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseDisksDisk setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDisksResponseDisksDisk setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseDisksDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDisksResponseDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDisksResponseDisksDisk setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDisksResponseDisksDisk setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public DescribeDisksResponseDisksDisk setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDisksResponseDisksDisk setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDisksResponseDisksDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDisksResponseDisksDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseDisksDisk setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDisksResponseDisksDisk setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDisksResponseDisksDisk setOperationLocks(DescribeDisksResponseDisksDiskOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDisksResponseDisksDiskOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDisksResponseDisksDisk setMountInstances(DescribeDisksResponseDisksDiskMountInstances mountInstances) {
            this.mountInstances = mountInstances;
            return this;
        }
        public DescribeDisksResponseDisksDiskMountInstances getMountInstances() {
            return this.mountInstances;
        }

        public DescribeDisksResponseDisksDisk setTags(DescribeDisksResponseDisksDiskTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDisksResponseDisksDiskTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeDisksResponseDisks extends TeaModel {
        @NameInMap("Disk")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDisk> disk;

        public static DescribeDisksResponseDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisks self = new DescribeDisksResponseDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseDisks setDisk(java.util.List<DescribeDisksResponseDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeDisksResponseDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
