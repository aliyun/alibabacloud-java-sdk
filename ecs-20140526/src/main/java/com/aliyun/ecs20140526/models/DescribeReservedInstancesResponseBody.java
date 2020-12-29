// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ReservedInstances")
    public DescribeReservedInstancesResponseBodyReservedInstances reservedInstances;

    public static DescribeReservedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesResponseBody self = new DescribeReservedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeReservedInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstancesResponseBody setReservedInstances(DescribeReservedInstancesResponseBodyReservedInstances reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }
    public DescribeReservedInstancesResponseBodyReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocksOperationLock extends TeaModel {
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
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        @NameInMap("OperationLocks")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks operationLocks;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("Tags")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags tags;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("OfferingType")
        public String offeringType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Scope")
        public String scope;

        public static DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance self = new DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setOperationLocks(DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setTags(DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags getTags() {
            return this.tags;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setOfferingType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }
        public String getOfferingType() {
            return this.offeringType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstance setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
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
