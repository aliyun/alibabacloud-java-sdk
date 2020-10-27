// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponse extends TeaModel {
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

    @NameInMap("ReservedInstances")
    @Validation(required = true)
    public DescribeReservedInstancesResponseReservedInstances reservedInstances;

    public static DescribeReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesResponse self = new DescribeReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeReservedInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReservedInstancesResponse setReservedInstances(DescribeReservedInstancesResponseReservedInstances reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }
    public DescribeReservedInstancesResponseReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        @Validation(required = true)
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock> operationLock;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks setOperationLock(java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag> tag;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags self = new DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags setTag(java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstancesReservedInstance extends TeaModel {
        @NameInMap("ReservedInstanceId")
        @Validation(required = true)
        public String reservedInstanceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ReservedInstanceName")
        @Validation(required = true)
        public String reservedInstanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("OfferingType")
        @Validation(required = true)
        public String offeringType;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("InstanceAmount")
        @Validation(required = true)
        public Integer instanceAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AllocationStatus")
        @Validation(required = true)
        public String allocationStatus;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks operationLocks;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags tags;

        public static DescribeReservedInstancesResponseReservedInstancesReservedInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstancesReservedInstance self = new DescribeReservedInstancesResponseReservedInstancesReservedInstance();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setOfferingType(String offeringType) {
            this.offeringType = offeringType;
            return this;
        }
        public String getOfferingType() {
            return this.offeringType;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setOperationLocks(DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeReservedInstancesResponseReservedInstancesReservedInstance setTags(DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeReservedInstancesResponseReservedInstancesReservedInstanceTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeReservedInstancesResponseReservedInstances extends TeaModel {
        @NameInMap("ReservedInstance")
        @Validation(required = true)
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstance> reservedInstance;

        public static DescribeReservedInstancesResponseReservedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesResponseReservedInstances self = new DescribeReservedInstancesResponseReservedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesResponseReservedInstances setReservedInstance(java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstance> reservedInstance) {
            this.reservedInstance = reservedInstance;
            return this;
        }
        public java.util.List<DescribeReservedInstancesResponseReservedInstancesReservedInstance> getReservedInstance() {
            return this.reservedInstance;
        }

    }

}
