// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the reserved instances.
    @NameInMap("ReservedInstances")
    public DescribeReservedInstancesResponseBodyReservedInstances reservedInstances;

    // The total number of reserved instances.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReservedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesResponseBody self = new DescribeReservedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReservedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstancesResponseBody setReservedInstances(DescribeReservedInstancesResponseBodyReservedInstances reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }
    public DescribeReservedInstancesResponseBodyReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    public DescribeReservedInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock extends TeaModel {
        // The reason why the reserved instance was locked.
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock> operationLock;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks setOperationLock(java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag extends TeaModel {
        // The tag key of the reserved instance.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the reserved instance.
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag> tag;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags setTag(java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance extends TeaModel {
        // Indicates the sharing status of the reserved instance when the AllocationType parameter is set to Shared. Valid values:
        // 
        // *   allocated: The reserved instance is allocated to another account.
        // *   beAllocated: The reserved instance is allocated by another account.
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        // The time when the reserved instance was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the reserved instance.
        @NameInMap("Description")
        public String description;

        // The time when the reserved instance expires.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The number of pay-as-you-go instances that are of the same instance type as the reserved instance and can be matched to the reserved instance.
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        // The instance type of the pay-as-you-go instances that can be matched to the reserved instance.
        @NameInMap("InstanceType")
        public String instanceType;

        // The payment option of the reserved instance.
        @NameInMap("OfferingType")
        public String offeringType;

        // Details about the lock status of the reserved instance.
        @NameInMap("OperationLocks")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks operationLocks;

        // The operating system of the reserved instance. Valid values:
        // 
        // - Windows: Windows Server operating systems
        // - Linux: Linux and Unix-like operating systems
        @NameInMap("Platform")
        public String platform;

        // The region ID of the reserved instance.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the reserved instance.
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        // The name of the reserved instance.
        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The scope of the reserved instance.
        @NameInMap("Scope")
        public String scope;

        // The time when the reserved instance took effect.
        @NameInMap("StartTime")
        public String startTime;

        // The status of the reserved instance.
        @NameInMap("Status")
        public String status;

        // Details about the tags of the reserved instance.
        @NameInMap("Tags")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags tags;

        // The zone ID of the reserved instance.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setOfferingType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }
        public String getOfferingType() {
            return this.offeringType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setOperationLocks(DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setTags(DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags getTags() {
            return this.tags;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstances extends TeaModel {
        @NameInMap("ReservedInstance")
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance> reservedInstance;

        public static DescribeReservedInstancesResponseBodyReservedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstances self = new DescribeReservedInstancesResponseBodyReservedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setReservedInstance(java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance> reservedInstance) {
            this.reservedInstance = reservedInstance;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance> getReservedInstance() {
            return this.reservedInstance;
        }

    }

}
