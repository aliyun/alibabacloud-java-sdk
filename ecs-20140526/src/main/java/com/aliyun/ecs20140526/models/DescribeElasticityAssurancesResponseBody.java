// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    @NameInMap("ElasticityAssuranceSet")
    public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet elasticityAssuranceSet;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages extends TeaModel {
        @NameInMap("ElasticityAssuranceUsage")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage> elasticityAssuranceUsage;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages setElasticityAssuranceUsage(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage> elasticityAssuranceUsage) {
            this.elasticityAssuranceUsage = elasticityAssuranceUsage;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsagesElasticityAssuranceUsage> getElasticityAssuranceUsage() {
            return this.elasticityAssuranceUsage;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        @NameInMap("ElasticityAssuranceUsages")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages elasticityAssuranceUsages;

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

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setElasticityAssuranceUsages(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages elasticityAssuranceUsages) {
            this.elasticityAssuranceUsages = elasticityAssuranceUsages;
            return this;
        }
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages getElasticityAssuranceUsages() {
            return this.elasticityAssuranceUsages;
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

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule extends TeaModel {
        @NameInMap("EndHour")
        public Integer endHour;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("StartHour")
        public Integer startHour;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules extends TeaModel {
        @NameInMap("RecurrenceRule")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule> recurrenceRule;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules setRecurrenceRule(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule> recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRulesRecurrenceRule> getRecurrenceRule() {
            return this.recurrenceRule;
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

        @NameInMap("ElasticityAssuranceOwnerId")
        public String elasticityAssuranceOwnerId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        @NameInMap("RecurrenceRules")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules recurrenceRules;

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

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setElasticityAssuranceOwnerId(String elasticityAssuranceOwnerId) {
            this.elasticityAssuranceOwnerId = elasticityAssuranceOwnerId;
            return this;
        }
        public String getElasticityAssuranceOwnerId() {
            return this.elasticityAssuranceOwnerId;
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

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
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

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setRecurrenceRules(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules recurrenceRules) {
            this.recurrenceRules = recurrenceRules;
            return this;
        }
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules getRecurrenceRules() {
            return this.recurrenceRules;
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
