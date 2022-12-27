// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    // Details about the capacity reservations.
    @NameInMap("CapacityReservationSet")
    public DescribeCapacityReservationsResponseBodyCapacityReservationSet capacityReservationSet;

    // The maximum number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token used to start the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
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
        // The instance type.
        @NameInMap("InstanceType")
        public String instanceType;

        // The total number of instances for which capacity of an instance type is reserved.
        @NameInMap("TotalAmount")
        public Integer totalAmount;

        // The number of instances that have used the capacity reservation.
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        // The zone ID.
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
        // The tag key of the capacity reservation.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the capacity reservation.
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
        // Details about the allocated resources.
        @NameInMap("AllocatedResources")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources;

        // The description of the capacity reservation.
        @NameInMap("Description")
        public String description;

        // The time when the capacity reservation expires.
        @NameInMap("EndTime")
        public String endTime;

        // The release mode of the capacity reservation. Valid values:
        // 
        // *   Limited: The capacity reservation is automatically released at the specified time.
        // *   Unlimited: The capacity reservation is manually released. You can release it at anytime.
        @NameInMap("EndTimeType")
        public String endTimeType;

        // The billing method of instances to be created by using the capacity reservation. Valid values:
        // 
        // *   PostPaid: pay-as-you-go
        // *   PrePaid: subscription
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        // The operating system type of instances to be created by using the capacity reservation. Valid values:
        // 
        // *   windows
        // *   linux
        @NameInMap("Platform")
        public String platform;

        // The ID of the capacity reservation.
        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        // The type of the private pool associated with the capacity reservation. Valid values:
        // 
        // *   Open: open private pool
        // *   Target: targeted private pool
        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        // The name of the capacity reservation.
        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        // The region ID of the capacity reservation.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the reserved instance used with the capacity reservation.
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        // The ID of the resource group to which the capacity reservation belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The ID of the savings plan used with the capacity reservation.
        @NameInMap("SavingPlanId")
        public String savingPlanId;

        // The time when the capacity reservation takes effect.
        @NameInMap("StartTime")
        public String startTime;

        // The mode in which the capacity reservation takes effect. Valid values:
        // 
        // - Now: The capacity reservation takes effect as soon as it is created.
        // - Later: The capacity reservation takes effect at the specified time.
        @NameInMap("StartTimeType")
        public String startTimeType;

        // The state of the capacity reservation. Valid values:
        // 
        // *   Pending: The capacity reservation is being initialized.
        // *   Preparing: The capacity reservation is being prepared.
        // *   Prepared: The capacity reservation is to take effect.
        // *   Active: The capacity reservation is in effect.
        // *   Released: The capacity reservation has been released manually or automatically when it expired.
        @NameInMap("Status")
        public String status;

        // The tags of the capacity reservation.
        @NameInMap("Tags")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags;

        // >  This parameter is currently in invitational preview and unavailable for general users.
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
