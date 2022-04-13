// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    @NameInMap("ElasticityAssuranceSet")
    public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet elasticityAssuranceSet;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeElasticityAssurancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssurancesResponseBody self = new DescribeElasticityAssurancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssurancesResponseBody setElasticityAssuranceSet(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet elasticityAssuranceSet) {
        this.elasticityAssuranceSet = elasticityAssuranceSet;
        return this;
    }
    public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet getElasticityAssuranceSet() {
        return this.elasticityAssuranceSet;
    }

    public DescribeElasticityAssurancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssurancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssurancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticityAssurancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> allocatedResource;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources setAllocatedResource(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag> tag;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags setTag(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem extends TeaModel {
        @NameInMap("AllocatedResources")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources allocatedResources;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

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
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags tags;

        @NameInMap("TotalAssuranceTimes")
        public String totalAssuranceTimes;

        @NameInMap("UsedAssuranceTimes")
        public Integer usedAssuranceTimes;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setAllocatedResources(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setLatestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsName(String privatePoolOptionsName) {
            this.privatePoolOptionsName = privatePoolOptionsName;
            return this;
        }
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setStartTimeType(String startTimeType) {
            this.startTimeType = startTimeType;
            return this;
        }
        public String getStartTimeType() {
            return this.startTimeType;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setTags(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags getTags() {
            return this.tags;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setTotalAssuranceTimes(String totalAssuranceTimes) {
            this.totalAssuranceTimes = totalAssuranceTimes;
            return this;
        }
        public String getTotalAssuranceTimes() {
            return this.totalAssuranceTimes;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setUsedAssuranceTimes(Integer usedAssuranceTimes) {
            this.usedAssuranceTimes = usedAssuranceTimes;
            return this;
        }
        public Integer getUsedAssuranceTimes() {
            return this.usedAssuranceTimes;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet extends TeaModel {
        @NameInMap("ElasticityAssuranceItem")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> elasticityAssuranceItem;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet setElasticityAssuranceItem(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> elasticityAssuranceItem) {
            this.elasticityAssuranceItem = elasticityAssuranceItem;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> getElasticityAssuranceItem() {
            return this.elasticityAssuranceItem;
        }

    }

}
