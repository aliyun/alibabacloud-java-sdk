// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("CapacityReservationSet")
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet;

    public static DescribeCapacityReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsResponseBody self = new DescribeCapacityReservationsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCapacityReservationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationsResponseBody setCapacityReservationSet(DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet) {
        this.capacityReservationSet = capacityReservationSet;
        return this;
    }
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet getCapacityReservationSet() {
        return this.capacityReservationSet;
    }

    public static class DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("zoneId")
        public String zoneId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("TimeSlot")
        public String timeSlot;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTimeType")
        public String endTimeType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("AllocatedResources")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources;

        @NameInMap("Tags")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags;

        public static DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem self = new DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }
        public String getTimeSlot() {
            return this.timeSlot;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
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

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setEndTimeType(String endTimeType) {
            this.endTimeType = endTimeType;
            return this;
        }
        public String getEndTimeType() {
            return this.endTimeType;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setAllocatedResources(DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItem setTags(DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags getTags() {
            return this.tags;
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
