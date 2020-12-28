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
    public java.util.List<DescribeReservedInstancesResponseBodyReservedInstances> reservedInstances;

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

    public DescribeReservedInstancesResponseBody setReservedInstances(java.util.List<DescribeReservedInstancesResponseBodyReservedInstances> reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }
    public java.util.List<DescribeReservedInstancesResponseBodyReservedInstances> getReservedInstances() {
        return this.reservedInstances;
    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks self = new DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstancesTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeReservedInstancesResponseBodyReservedInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstancesTags self = new DescribeReservedInstancesResponseBodyReservedInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeReservedInstancesResponseBodyReservedInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeReservedInstancesResponseBodyReservedInstances extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        @NameInMap("OperationLocks")
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks> operationLocks;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("Tags")
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesTags> tags;

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

        public static DescribeReservedInstancesResponseBodyReservedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseBodyReservedInstances self = new DescribeReservedInstancesResponseBodyReservedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setOperationLocks(java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setTags(java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseBodyReservedInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setOfferingType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }
        public String getOfferingType() {
            return this.offeringType;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeReservedInstancesResponseBodyReservedInstances setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
