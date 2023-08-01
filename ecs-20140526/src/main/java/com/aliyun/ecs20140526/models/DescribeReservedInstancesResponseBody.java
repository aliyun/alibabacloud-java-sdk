// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the reserved instances.</p>
     */
    @NameInMap("ReservedInstances")
    public DescribeReservedInstancesResponseBodyReservedInstances reservedInstances;

    /**
     * <p>The total number of reserved instances.</p>
     */
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
        /**
         * <p>The reason why the instance is locked.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>Indicates the sharing status of the reserved instance when the AllocationType parameter is set to Shared. Valid values:</p>
         * <br>
         * <p>*   allocated: The reserved instance is allocated to another account.</p>
         * <p>*   beAllocated: The reserved instance is allocated by another account.</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of pay-as-you-go instances that are of the same instance type as the reserved instance and can be matched to the reserved instance.</p>
         */
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        /**
         * <p>The instance type of the pay-as-you-go instances that can be matched to the reserved instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The payment option.</p>
         */
        @NameInMap("OfferingType")
        public String offeringType;

        /**
         * <p>Details about the lock status of the reserved instance.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceOperationLocks operationLocks;

        /**
         * <p>The operating system of the image used by the instance. Valid values:</p>
         * <br>
         * <p>*   Windows</p>
         * <p>*   Linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The reserved instance ID.</p>
         */
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        /**
         * <p>The name.</p>
         */
        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The scope.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The effective time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Details about the tags of the reserved instance.</p>
         */
        @NameInMap("Tags")
        public DescribeReservedInstancesResponseBodyReservedInstancesReservedInstanceTags tags;

        /**
         * <p>The zone ID.</p>
         */
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
