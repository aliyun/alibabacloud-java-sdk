// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("CapacityReservationSet")
    @Validation(required = true)
    public DescribeCapacityReservationsResponseCapacityReservationSet capacityReservationSet;

    public static DescribeCapacityReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsResponse self = new DescribeCapacityReservationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityReservationsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCapacityReservationsResponse setCapacityReservationSet(DescribeCapacityReservationsResponseCapacityReservationSet capacityReservationSet) {
        this.capacityReservationSet = capacityReservationSet;
        return this;
    }
    public DescribeCapacityReservationsResponseCapacityReservationSet getCapacityReservationSet() {
        return this.capacityReservationSet;
    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("zoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("TotalAmount")
        @Validation(required = true)
        public Integer totalAmount;

        @NameInMap("UsedAmount")
        @Validation(required = true)
        public Integer usedAmount;

        public static DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource self = new DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        @Validation(required = true)
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> allocatedResource;

        public static DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources self = new DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources setAllocatedResource(java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag self = new DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag> tag;

        public static DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags self = new DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags setTag(java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem extends TeaModel {
        @NameInMap("PrivatePoolOptionsId")
        @Validation(required = true)
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsName")
        @Validation(required = true)
        public String privatePoolOptionsName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        @Validation(required = true)
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("EndTimeType")
        @Validation(required = true)
        public String endTimeType;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("TimeSlot")
        @Validation(required = true)
        public String timeSlot;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AllocatedResources")
        @Validation(required = true)
        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags tags;

        public static DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem self = new DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsName(String privatePoolOptionsName) {
            this.privatePoolOptionsName = privatePoolOptionsName;
            return this;
        }
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setEndTimeType(String endTimeType) {
            this.endTimeType = endTimeType;
            return this;
        }
        public String getEndTimeType() {
            return this.endTimeType;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }
        public String getTimeSlot() {
            return this.timeSlot;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setAllocatedResources(DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemAllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem setTags(DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItemTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeCapacityReservationsResponseCapacityReservationSet extends TeaModel {
        @NameInMap("CapacityReservationItem")
        @Validation(required = true)
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem> capacityReservationItem;

        public static DescribeCapacityReservationsResponseCapacityReservationSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsResponseCapacityReservationSet self = new DescribeCapacityReservationsResponseCapacityReservationSet();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsResponseCapacityReservationSet setCapacityReservationItem(java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem> capacityReservationItem) {
            this.capacityReservationItem = capacityReservationItem;
            return this;
        }
        public java.util.List<DescribeCapacityReservationsResponseCapacityReservationSetCapacityReservationItem> getCapacityReservationItem() {
            return this.capacityReservationItem;
        }

    }

}
