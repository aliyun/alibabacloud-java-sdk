// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReservedInstances")
    public ReservedInstances reservedInstances;

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

    public DescribeReservedInstancesResponseBody setReservedInstances(ReservedInstances reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }
    public ReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    public DescribeReservedInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class OperationLock extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static OperationLock build(java.util.Map<String, ?> map) throws Exception {
            OperationLock self = new OperationLock();
            return TeaModel.build(map, self);
        }

        public OperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class OperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<OperationLock> operationLock;

        public static OperationLocks build(java.util.Map<String, ?> map) throws Exception {
            OperationLocks self = new OperationLocks();
            return TeaModel.build(map, self);
        }

        public OperationLocks setOperationLock(java.util.List<OperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<OperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public Tag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

    public static class ReservedInstance extends TeaModel {
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OfferingType")
        public String offeringType;

        @NameInMap("OperationLocks")
        public OperationLocks operationLocks;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ReservedInstance build(java.util.Map<String, ?> map) throws Exception {
            ReservedInstance self = new ReservedInstance();
            return TeaModel.build(map, self);
        }

        public ReservedInstance setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public ReservedInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ReservedInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReservedInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ReservedInstance setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public ReservedInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ReservedInstance setOfferingType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }
        public String getOfferingType() {
            return this.offeringType;
        }

        public ReservedInstance setOperationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public ReservedInstance setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ReservedInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReservedInstance setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public ReservedInstance setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public ReservedInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ReservedInstance setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ReservedInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ReservedInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ReservedInstance setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public ReservedInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ReservedInstances extends TeaModel {
        @NameInMap("ReservedInstance")
        public java.util.List<ReservedInstance> reservedInstance;

        public static ReservedInstances build(java.util.Map<String, ?> map) throws Exception {
            ReservedInstances self = new ReservedInstances();
            return TeaModel.build(map, self);
        }

        public ReservedInstances setReservedInstance(java.util.List<ReservedInstance> reservedInstance) {
            this.reservedInstance = reservedInstance;
            return this;
        }
        public java.util.List<ReservedInstance> getReservedInstance() {
            return this.reservedInstance;
        }

    }

}
