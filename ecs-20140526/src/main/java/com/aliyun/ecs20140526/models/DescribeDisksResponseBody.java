// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Disks")
    public java.util.List<DescribeDisksResponseBodyDisks> disks;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksResponseBody setDisks(java.util.List<DescribeDisksResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<DescribeDisksResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public static class DescribeDisksResponseBodyDisksOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDisksResponseBodyDisksOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksOperationLocks self = new DescribeDisksResponseBodyDisksOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDisksResponseBodyDisksTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeDisksResponseBodyDisksTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksTags self = new DescribeDisksResponseBodyDisksTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDisksResponseBodyDisksTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeDisksResponseBodyDisksMountInstances extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksMountInstances self = new DescribeDisksResponseBodyDisksMountInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksMountInstances setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksMountInstances setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksMountInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisks extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("OperationLocks")
        public java.util.List<DescribeDisksResponseBodyDisksOperationLocks> operationLocks;

        @NameInMap("BdfId")
        public String bdfId;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("StorageSetId")
        public String storageSetId;

        @NameInMap("Tags")
        public java.util.List<DescribeDisksResponseBodyDisksTags> tags;

        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("MountInstances")
        public java.util.List<DescribeDisksResponseBodyDisksMountInstances> mountInstances;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("DetachedTime")
        public String detachedTime;

        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("EnableAutomatedSnapshotPolicy")
        public Boolean enableAutomatedSnapshotPolicy;

        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IOPS")
        public Integer IOPS;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("DiskChargeType")
        public String diskChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("Category")
        public String category;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisks self = new DescribeDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisks setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDisksResponseBodyDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDisksResponseBodyDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseBodyDisks setOperationLocks(java.util.List<DescribeDisksResponseBodyDisksOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDisksResponseBodyDisks setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDisksResponseBodyDisks setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisks setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDisksResponseBodyDisks setTags(java.util.List<DescribeDisksResponseBodyDisksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksTags> getTags() {
            return this.tags;
        }

        public DescribeDisksResponseBodyDisks setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDisksResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyDisks setMountInstances(java.util.List<DescribeDisksResponseBodyDisksMountInstances> mountInstances) {
            this.mountInstances = mountInstances;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksMountInstances> getMountInstances() {
            return this.mountInstances;
        }

        public DescribeDisksResponseBodyDisks setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisks setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyDisks setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDisksResponseBodyDisks setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDisksResponseBodyDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseBodyDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyDisks setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseBodyDisks setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDisksResponseBodyDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDisksResponseBodyDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDisksResponseBodyDisks setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseBodyDisks setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDisksResponseBodyDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeDisksResponseBodyDisks setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        public DescribeDisksResponseBodyDisks setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDisksResponseBodyDisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDisks setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public DescribeDisksResponseBodyDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseBodyDisks setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDisksResponseBodyDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyDisks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseBodyDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseBodyDisks setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDisksResponseBodyDisks setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyDisks setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
