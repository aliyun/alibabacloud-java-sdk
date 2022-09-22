// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePrivatePoolsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrivatePoolSet")
    public PrivatePoolSet privatePoolSet;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePrivatePoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivatePoolsResponseBody self = new DescribePrivatePoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivatePoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePrivatePoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrivatePoolsResponseBody setPrivatePoolSet(PrivatePoolSet privatePoolSet) {
        this.privatePoolSet = privatePoolSet;
        return this;
    }
    public PrivatePoolSet getPrivatePoolSet() {
        return this.privatePoolSet;
    }

    public DescribePrivatePoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrivatePoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class AllocatedResource extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("zoneId")
        public String zoneId;

        public static AllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            AllocatedResource self = new AllocatedResource();
            return TeaModel.build(map, self);
        }

        public AllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public AllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public AllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public AllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class AllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        public java.util.List<AllocatedResource> allocatedResource;

        public static AllocatedResources build(java.util.Map<String, ?> map) throws Exception {
            AllocatedResources self = new AllocatedResources();
            return TeaModel.build(map, self);
        }

        public AllocatedResources setAllocatedResource(java.util.List<AllocatedResource> allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public java.util.List<AllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
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

    public static class PrivatePoolItem extends TeaModel {
        @NameInMap("AllocatedResources")
        public AllocatedResources allocatedResources;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimeType")
        public String endTimeType;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        @NameInMap("PrivatePoolOptionsType")
        public String privatePoolOptionsType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimeType")
        public String startTimeType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("TotalAssuranceTimes")
        public String totalAssuranceTimes;

        @NameInMap("UsedAssuranceTimes")
        public Integer usedAssuranceTimes;

        public static PrivatePoolItem build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolItem self = new PrivatePoolItem();
            return TeaModel.build(map, self);
        }

        public PrivatePoolItem setAllocatedResources(AllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public AllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public PrivatePoolItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PrivatePoolItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public PrivatePoolItem setEndTimeType(String endTimeType) {
            this.endTimeType = endTimeType;
            return this;
        }
        public String getEndTimeType() {
            return this.endTimeType;
        }

        public PrivatePoolItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public PrivatePoolItem setLatestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        public PrivatePoolItem setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public PrivatePoolItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public PrivatePoolItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public PrivatePoolItem setPrivatePoolOptionsName(String privatePoolOptionsName) {
            this.privatePoolOptionsName = privatePoolOptionsName;
            return this;
        }
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
        }

        public PrivatePoolItem setPrivatePoolOptionsType(String privatePoolOptionsType) {
            this.privatePoolOptionsType = privatePoolOptionsType;
            return this;
        }
        public String getPrivatePoolOptionsType() {
            return this.privatePoolOptionsType;
        }

        public PrivatePoolItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PrivatePoolItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public PrivatePoolItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public PrivatePoolItem setStartTimeType(String startTimeType) {
            this.startTimeType = startTimeType;
            return this;
        }
        public String getStartTimeType() {
            return this.startTimeType;
        }

        public PrivatePoolItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PrivatePoolItem setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public PrivatePoolItem setTotalAssuranceTimes(String totalAssuranceTimes) {
            this.totalAssuranceTimes = totalAssuranceTimes;
            return this;
        }
        public String getTotalAssuranceTimes() {
            return this.totalAssuranceTimes;
        }

        public PrivatePoolItem setUsedAssuranceTimes(Integer usedAssuranceTimes) {
            this.usedAssuranceTimes = usedAssuranceTimes;
            return this;
        }
        public Integer getUsedAssuranceTimes() {
            return this.usedAssuranceTimes;
        }

    }

    public static class PrivatePoolSet extends TeaModel {
        @NameInMap("PrivatePoolItem")
        public java.util.List<PrivatePoolItem> privatePoolItem;

        public static PrivatePoolSet build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolSet self = new PrivatePoolSet();
            return TeaModel.build(map, self);
        }

        public PrivatePoolSet setPrivatePoolItem(java.util.List<PrivatePoolItem> privatePoolItem) {
            this.privatePoolItem = privatePoolItem;
            return this;
        }
        public java.util.List<PrivatePoolItem> getPrivatePoolItem() {
            return this.privatePoolItem;
        }

    }

}
