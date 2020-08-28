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

    @NameInMap("Disks")
    @Validation(required = true)
    public DescribeDisksResponseDisks disks;

    public static DescribeDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponse self = new DescribeDisksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDisksResponseDisksDiskOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeDisksResponseDisksDiskOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskOperationLocksOperationLock self = new DescribeDisksResponseDisksDiskOperationLocksOperationLock();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDisksResponseDisksDiskMountInstances extends TeaModel {
        @NameInMap("MountInstance")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDiskMountInstancesMountInstance> mountInstance;

        public static DescribeDisksResponseDisksDiskMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskMountInstances self = new DescribeDisksResponseDisksDiskMountInstances();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDisksResponseDisksDiskTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDiskTagsTag> tag;

        public static DescribeDisksResponseDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisksDiskTags self = new DescribeDisksResponseDisksDiskTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDisksResponseDisks extends TeaModel {
        @NameInMap("Disk")
        @Validation(required = true)
        public java.util.List<DescribeDisksResponseDisksDisk> disk;

        public static DescribeDisksResponseDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseDisks self = new DescribeDisksResponseDisks();
            return TeaModel.build(map, self);
        }

    }

}
