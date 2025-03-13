// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    /**
     * <p>Details about the elasticity assurances.</p>
     */
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
        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1144775968548340</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         */
        @NameInMap("ElasticityAssuranceUsages")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResourceElasticityAssuranceUsages elasticityAssuranceUsages;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The total number of instances for which capacity of an instance type is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalAmount")
        public Integer totalAmount;

        /**
         * <p>The number of instances that have used the elasticity assurance.</p>
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
        /**
         * <p>The time when the time-segmented assurance ends.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the recurrence rule. Valid values:</p>
         * <ul>
         * <li>Daily</li>
         * <li>Weekly</li>
         * <li>Monthly</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The recurrence value of the time-segmented assurance. Valid values:</p>
         * <ul>
         * <li>If you set <code>RecurrenceType</code> to <code>Daily</code>, you can set RecurrenceValue to only one value. Valid values: 1 to 31. The time-segmented assurance is performed every few days.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Weekly</code>, you can set RecurrenceValue to one or more values. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> indicates that the time-segmented assurance is performed on Monday and Tuesday of every week.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Monthly</code>, you can set RecurrenceValue to two values in the <code>A-B</code> format. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> indicates that the time-segmented assurance is performed from the 1st to the 5th of each month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The time when the time-segmented assurance takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>Details of the allocated resources.</p>
         */
        @NameInMap("AllocatedResources")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources allocatedResources;

        /**
         * <p>The description of the elasticity assurance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e114477596854834</p>
         */
        @NameInMap("ElasticityAssuranceOwnerId")
        public String elasticityAssuranceOwnerId;

        /**
         * <p>The time when the elasticity assurance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03T16:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The billing method of the instance. The value can be only PostPaid. Only pay-as-you-go instances can be created by using elasticity assurances.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("LatestStartTime")
        public String latestStartTime;

        /**
         * <p>The type of the elasticity assurance. Valid values:</p>
         * <ul>
         * <li>ElasticityAssurance: the general-purpose elasticity assurance.</li>
         * <li>TimeDivisionElasticityAssurance: the time-segmented assurance of the elasticity assurance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ElasticityAssurance</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The ID of the elasticity assurance.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp1ir35kqtn8ywci****</p>
         */
        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        /**
         * <p>The type of the private pool associated with the elasticity assurance. Valid values:</p>
         * <ul>
         * <li>Open: open private pool</li>
         * <li>Target: specific private pool</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Target</p>
         */
        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        /**
         * <p>The name of the elasticity assurance.</p>
         * 
         * <strong>example:</strong>
         * <p>eapTestName</p>
         */
        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        /**
         * <p>The recurrence rules of the time-segmented assurances.</p>
         */
        @NameInMap("RecurrenceRules")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemRecurrenceRules recurrenceRules;

        /**
         * <p>The region ID of the elasticity assurance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The time when the elasticity assurance takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-03T05:25Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates when the elasticity assurance takes effect. Valid values:</p>
         * <ul>
         * <li>Now: The elasticity assurance takes effect immediately after it is created.</li>
         * <li>Later: The elasticity assurance takes effect at a specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Now</p>
         */
        @NameInMap("StartTimeType")
        public String startTimeType;

        /**
         * <p>The status of the elasticity assurance. Valid values:</p>
         * <ul>
         * <li>Preparing</li>
         * <li>Prepared</li>
         * <li>Active</li>
         * <li>Released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the elasticity assurance.</p>
         */
        @NameInMap("Tags")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemTags tags;

        /**
         * <p>The total number of times that the elasticity assurance is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlimited</p>
         */
        @NameInMap("TotalAssuranceTimes")
        public String totalAssuranceTimes;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
