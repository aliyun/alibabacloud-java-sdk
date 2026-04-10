// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("CapacityReservationSet")
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCapacityReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsResponseBody self = new DescribeCapacityReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsResponseBody setCapacityReservationSet(DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet) {
        this.capacityReservationSet = capacityReservationSet;
        return this;
    }
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet getCapacityReservationSet() {
        return this.capacityReservationSet;
    }

    public DescribeCapacityReservationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityReservationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages extends TeaModel {
        @NameInMap("CapacityReservationUsage")
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage> capacityReservationUsage;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages setCapacityReservationUsage(java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage> capacityReservationUsage) {
            this.capacityReservationUsage = capacityReservationUsage;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsagesCapacityReservationUsage> getCapacityReservationUsage() {
            return this.capacityReservationUsage;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        @NameInMap("CapacityReservationUsages")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages capacityReservationUsages;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailedAmount")
        public Integer failedAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockedAmount")
        public Integer lockedAmount;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setCapacityReservationUsages(DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages capacityReservationUsages) {
            this.capacityReservationUsages = capacityReservationUsages;
            return this;
        }
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages getCapacityReservationUsages() {
            return this.capacityReservationUsages;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setFailedAmount(Integer failedAmount) {
            this.failedAmount = failedAmount;
            return this;
        }
        public Integer getFailedAmount() {
            return this.failedAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setLockedAmount(Integer lockedAmount) {
            this.lockedAmount = lockedAmount;
            return this;
        }
        public Integer getLockedAmount() {
            return this.lockedAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> allocatedResource;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources setAllocatedResource(java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag> tag;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags setTag(java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem extends TeaModel {
        @NameInMap("AllocatedResources")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources;

        @NameInMap("CapacityReservationOwnerId")
        public String capacityReservationOwnerId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimeType")
        public String endTimeType;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SavingPlanId")
        public String savingPlanId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimeType")
        public String startTimeType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags;

        @NameInMap("TimeSlot")
        public String timeSlot;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setAllocatedResources(DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setCapacityReservationOwnerId(String capacityReservationOwnerId) {
            this.capacityReservationOwnerId = capacityReservationOwnerId;
            return this;
        }
        public String getCapacityReservationOwnerId() {
            return this.capacityReservationOwnerId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setEndTimeType(String endTimeType) {
            this.endTimeType = endTimeType;
            return this;
        }
        public String getEndTimeType() {
            return this.endTimeType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsName(String privatePoolOptionsName) {
            this.privatePoolOptionsName = privatePoolOptionsName;
            return this;
        }
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setSavingPlanId(String savingPlanId) {
            this.savingPlanId = savingPlanId;
            return this;
        }
        public String getSavingPlanId() {
            return this.savingPlanId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setStartTimeType(String startTimeType) {
            this.startTimeType = startTimeType;
            return this;
        }
        public String getStartTimeType() {
            return this.startTimeType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setTags(DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags getTags() {
            return this.tags;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }
        public String getTimeSlot() {
            return this.timeSlot;
        }

    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSet extends TeaModel {
        @NameInMap("CapacityReservationItem")
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem> capacityReservationItem;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSet self = new DescribeCapacityReservationsResponseBodyCapacityReservationSet();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSet setCapacityReservationItem(java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem> capacityReservationItem) {
            this.capacityReservationItem = capacityReservationItem;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem> getCapacityReservationItem() {
            return this.capacityReservationItem;
        }

    }

}
