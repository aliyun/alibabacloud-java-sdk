// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    // Details about the disks.
    @NameInMap("Disks")
    public DescribeDisksResponseBodyDisks disks;

    // The query token returned in this call.
    @NameInMap("NextToken")
    public String nextToken;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setDisks(DescribeDisksResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDisksResponseBodyDisks getDisks() {
        return this.disks;
    }

    public DescribeDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisksResponseBodyDisksDiskAttachmentsAttachment extends TeaModel {
        // The time when the disk was attached. The time is displayed in UTC.
        @NameInMap("AttachedTime")
        public String attachedTime;

        // The device name of the disk.
        @NameInMap("Device")
        public String device;

        // The ID of the instance to which the disk was attached.
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksDiskAttachmentsAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskAttachmentsAttachment self = new DescribeDisksResponseBodyDisksDiskAttachmentsAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskAttachments extends TeaModel {
        @NameInMap("Attachment")
        public java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> attachment;

        public static DescribeDisksResponseBodyDisksDiskAttachments build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskAttachments self = new DescribeDisksResponseBodyDisksDiskAttachments();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskAttachments setAttachment(java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> attachment) {
            this.attachment = attachment;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> getAttachment() {
            return this.attachment;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance extends TeaModel {
        // The time when the cloud disk was attached. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("AttachedTime")
        public String attachedTime;

        // The mount point of the disk.
        @NameInMap("Device")
        public String device;

        // The ID of the instance to which the disk is attached.
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance self = new DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstances extends TeaModel {
        @NameInMap("MountInstance")
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance;

        public static DescribeDisksResponseBodyDisksDiskMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstances self = new DescribeDisksResponseBodyDisksDiskMountInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstances setMountInstance(java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance) {
            this.mountInstance = mountInstance;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> getMountInstance() {
            return this.mountInstance;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock extends TeaModel {
        // The security reason why the disk was locked.
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock self = new DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock;

        public static DescribeDisksResponseBodyDisksDiskOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocks self = new DescribeDisksResponseBodyDisksDiskOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocks setOperationLock(java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTagsTag extends TeaModel {
        // The tag key of the disk.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the disk.
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDisksResponseBodyDisksDiskTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTagsTag self = new DescribeDisksResponseBodyDisksDiskTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag;

        public static DescribeDisksResponseBodyDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTags self = new DescribeDisksResponseBodyDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTags setTag(java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDisksResponseBodyDisksDisk extends TeaModel {
        // The time when the cloud disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.
        @NameInMap("AttachedTime")
        public String attachedTime;

        // The attachment information of the cloud disk. The value is an array that consists of the `Attachment` values. This value is not returned when you query Shared Block Storage devices.
        @NameInMap("Attachments")
        public DescribeDisksResponseBodyDisksDiskAttachments attachments;

        // The ID of the automatic snapshot policy that is applied to the cloud disk.
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        // This parameter is in invitational preview and is unavailable for general users.
        @NameInMap("BdfId")
        public String bdfId;

        // This parameter is unavailable.
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The category of the disk. Valid values:
        // 
        // *   cloud: basic disk
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: ESSD
        // *   local_ssd_pro: I/O-intensive local disk
        // *   local_hdd_pro: throughput-intensive local disk
        // *   ephemeral: retired local disk
        // *   ephemeral_ssd: retired local SSD
        @NameInMap("Category")
        public String category;

        // The time when the disk was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // Indicates whether the automatic snapshots of the cloud disk are deleted when the disk is released. Valid values:
        // 
        // *   true: The automatic snapshots of the cloud disk are deleted when the disk is released.
        // *   false: The automatic snapshots of the cloud disk are retained when the disk is released.
        // 
        // Snapshots that are created by calling the [CreateSnapshot](~~25524~~) operation or by using the Elastic Compute Service (ECS) console are retained and not affected by this parameter.
        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        // Indicates whether the cloud disk is released when its associated instance is released. Valid values:
        // 
        // *   true: The cloud disk is released when its associated instance is released.
        // *   false: The cloud disk is retained when its associated instance is released.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of the disk.
        @NameInMap("Description")
        public String description;

        // The time when the cloud disk was last detached.
        @NameInMap("DetachedTime")
        public String detachedTime;

        // The device name of the disk on its associated instance. Example: /dev/xvdb. Take note of the following items:
        // 
        // *   This parameter has a value only when the `Status` value is `In_use`.
        // *   This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the disk based on the `Attachment` values.
        // 
        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("Device")
        public String device;

        // The billing method of the disk. Valid values:
        // 
        // *   PrePaid: subscription
        // *   PostPaid: pay-as-you-go
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        // The ID of the disk.
        @NameInMap("DiskId")
        public String diskId;

        // The name of the disk.
        @NameInMap("DiskName")
        public String diskName;

        // Indicates whether the automatic snapshot policy feature is enabled for the cloud disk.
        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        // Indicates whether an automatic snapshot policy was applied to the cloud disk.
        @NameInMap("EnableAutomatedSnapshotPolicy")
        public Boolean enableAutomatedSnapshotPolicy;

        // Indicates whether the cloud disk was encrypted.
        @NameInMap("Encrypted")
        public Boolean encrypted;

        // The time when the subscription cloud disk expires.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The maximum number of IOPS.
        @NameInMap("IOPS")
        public Integer IOPS;

        // The maximum number of read operations per second.
        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        // The maximum number of write operations per second.
        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        // The ID of the image that was used to create the instance. This parameter is empty unless the cloud disk was created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.
        @NameInMap("ImageId")
        public String imageId;

        // The ID of the instance to which the disk was attached. Take note of the following items:
        // 
        // *   This parameter has a value only when the `Status` value is `In_use`.
        // *   This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the disk based on the `Attachment` values.
        @NameInMap("InstanceId")
        public String instanceId;

        // The ID of the KMS key that is used by the cloud disk.
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        // The number of instances to which the Shared Block Storage device is attached.
        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        // The attachment information of the Shared Block Storage device.
        @NameInMap("MountInstances")
        public DescribeDisksResponseBodyDisksDiskMountInstances mountInstances;

        // Indicates whether the multi-attach feature was enabled for the cloud disk.
        @NameInMap("MultiAttach")
        public String multiAttach;

        // The reasons why the disk was locked.
        @NameInMap("OperationLocks")
        public DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks;

        // The performance level of the ESSD. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // Indicates whether the disk is removable.
        @NameInMap("Portable")
        public Boolean portable;

        // The product code in Alibaba Cloud Marketplace.
        @NameInMap("ProductCode")
        public String productCode;

        // This parameter is unavailable.
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The region ID of the disk.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group to which the disk belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The serial number of the disk.
        @NameInMap("SerialNumber")
        public String serialNumber;

        // The size of the disk. Unit: GiB.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot that was used to create the cloud disk.
        // 
        // This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        // The state of the cloud disk. Valid values:
        // 
        // *   In_use
        // *   Available
        // *   Attaching
        // *   Detaching
        // *   Creating
        // *   ReIniting
        @NameInMap("Status")
        public String status;

        // The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        // The ID of the storage set.
        @NameInMap("StorageSetId")
        public String storageSetId;

        // The maximum number of partitions in the storage set.
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        // The tags of the disk.
        @NameInMap("Tags")
        public DescribeDisksResponseBodyDisksDiskTags tags;

        // The amount of data transferred per second. Unit: MB/s.
        @NameInMap("Throughput")
        public Integer throughput;

        // The type of the disk. Valid values:
        // 
        // *   system: system disk
        // *   data: data disk
        @NameInMap("Type")
        public String type;

        // The zone ID of the disk.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDisksResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDisk self = new DescribeDisksResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setAttachments(DescribeDisksResponseBodyDisksDiskAttachments attachments) {
            this.attachments = attachments;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskAttachments getAttachments() {
            return this.attachments;
        }

        public DescribeDisksResponseBodyDisksDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeDisksResponseBodyDisksDisk setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDisksResponseBodyDisksDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDisksResponseBodyDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDisksResponseBodyDisksDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseBodyDisksDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        public DescribeDisksResponseBodyDisksDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyDisksDisk setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDisksResponseBodyDisksDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDisksResponseBodyDisksDisk setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDisksDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstances(DescribeDisksResponseBodyDisksDiskMountInstances mountInstances) {
            this.mountInstances = mountInstances;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskMountInstances getMountInstances() {
            return this.mountInstances;
        }

        public DescribeDisksResponseBodyDisksDisk setMultiAttach(String multiAttach) {
            this.multiAttach = multiAttach;
            return this;
        }
        public String getMultiAttach() {
            return this.multiAttach;
        }

        public DescribeDisksResponseBodyDisksDisk setOperationLocks(DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDisksResponseBodyDisksDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseBodyDisksDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseBodyDisksDisk setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDisksResponseBodyDisksDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeDisksResponseBodyDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseBodyDisksDisk setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseBodyDisksDisk setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyDisksDisk setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDisksResponseBodyDisksDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setTags(DescribeDisksResponseBodyDisksDiskTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskTags getTags() {
            return this.tags;
        }

        public DescribeDisksResponseBodyDisksDisk setThroughput(Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Integer getThroughput() {
            return this.throughput;
        }

        public DescribeDisksResponseBodyDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDisksResponseBodyDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDisksResponseBodyDisks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<DescribeDisksResponseBodyDisksDisk> disk;

        public static DescribeDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisks self = new DescribeDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisks setDisk(java.util.List<DescribeDisksResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
