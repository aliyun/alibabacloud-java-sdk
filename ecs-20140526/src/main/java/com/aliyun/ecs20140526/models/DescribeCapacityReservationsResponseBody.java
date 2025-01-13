// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    /**
     * <p>Details of the capacity reservations.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>105909559088****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute.aliyuncs.com</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The number of instances that are used by the Alibaba Cloud account or service.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
        /**
         * <p>The number of available instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        /**
         * <p>Details of instance usage.</p>
         */
        @NameInMap("CapacityReservationUsages")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResourcesAllocatedResourceCapacityReservationUsages capacityReservationUsages;

        /**
         * <p>The instance type of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The total number of instances for which the capacity of an instance type is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalAmount")
        public Integer totalAmount;

        /**
         * <p>The number of instances that have used the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>Details of the allocated resources.</p>
         */
        @NameInMap("AllocatedResources")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemAllocatedResources allocatedResources;

        /**
         * <p>The ID of the capacity reservation owner.</p>
         * 
         * <strong>example:</strong>
         * <p>100************7</p>
         */
        @NameInMap("CapacityReservationOwnerId")
        public String capacityReservationOwnerId;

        /**
         * <p>The description of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the capacity reservation expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-19T03:02Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The release mode of the capacity reservation. Valid values:</p>
         * <ul>
         * <li>Limited: The capacity reservation is automatically released at a specified time.</li>
         * <li>Unlimited: The capacity reservation is manually released. You can release the capacity reservation anytime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlimited</p>
         */
        @NameInMap("EndTimeType")
        public String endTimeType;

        /**
         * <p>The billing method of the instances created by using the capacity reservation. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The operating system type of the instances created by using the capacity reservation. Valid values:</p>
         * <ul>
         * <li>windows</li>
         * <li>linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-bp1gubrkqutenqdd****</p>
         */
        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        /**
         * <p>The type of the private pool generated after the capacity reservation takes effect. Valid values:</p>
         * <ul>
         * <li>Open: open private pool. If you use the capacity reservation to create Elastic Compute Service (ECS) instances, the open private pool that is associated with the capacity reservation is automatically matched. If no capacity is available in the open private pool, resources in the public pool are automatically used to create the instances.</li>
         * <li>Target: targeted private pool. If you use the capacity reservation to create ECS instances, the targeted private pool that is associated with the capacity reservation is automatically matched. If no capacity is available in the private pool, the instances fail to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        /**
         * <p>The name of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>crpTestName</p>
         */
        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        /**
         * <p>The region ID of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the reserved instance used with the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-bpzhex2ulpzf53****</p>
         */
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        /**
         * <p>The ID of the resource group to which the capacity reservation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the savings plan used with the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>spn-c29b5e18pJMT****</p>
         */
        @NameInMap("SavingPlanId")
        public String savingPlanId;

        /**
         * <p>The time when the capacity reservation takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-19T02:01Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The mode in which the capacity reservation takes effect. Valid values:</p>
         * <ul>
         * <li>Now: The capacity reservation takes effect immediately after it is created.</li>
         * <li>Later: The capacity reservation takes effect at a specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Now</p>
         */
        @NameInMap("StartTimeType")
        public String startTimeType;

        /**
         * <p>The status of the capacity reservation. Valid values:</p>
         * <ul>
         * <li>Pending: The capacity reservation is being initialized.</li>
         * <li>Preparing: The capacity reservation is being prepared.</li>
         * <li>Prepared: The capacity reservation is to take effect.</li>
         * <li>Active: The capacity reservation is in effect.</li>
         * <li>Released: The capacity reservation has been released manually or automatically when it expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the capacity reservation.</p>
         */
        @NameInMap("Tags")
        public DescribeCapacityReservationsResponseBodyCapacityReservationSetCapacityReservationItemTags tags;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
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
