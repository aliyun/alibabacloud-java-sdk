// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("CapacityReservationSet")
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

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

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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
