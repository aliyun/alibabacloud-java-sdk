// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Policies")
    public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnterpriseSnapshotPolicyResponseBody self = new DescribeEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setPolicies(java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnterpriseSnapshotPolicyResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RetainDays")
        public Integer retainDays;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions setRetainDays(Integer retainDays) {
            this.retainDays = retainDays;
            return this;
        }
        public Integer getRetainDays() {
            return this.retainDays;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Regions")
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions> regions;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo setRegions(java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfoRegions> getRegions() {
            return this.regions;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule extends TeaModel {
        @NameInMap("Number")
        public Integer number;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule extends TeaModel {
        @NameInMap("CronExpression")
        public String cronExpression;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules extends TeaModel {
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules setSpecialPeriodUnit(String specialPeriodUnit) {
            this.specialPeriodUnit = specialPeriodUnit;
            return this;
        }
        public String getSpecialPeriodUnit() {
            return this.specialPeriodUnit;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Rules")
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules> rules;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules setRules(java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRulesRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule extends TeaModel {
        @NameInMap("EnableImmediateAccess")
        public Boolean enableImmediateAccess;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule setEnableImmediateAccess(Boolean enableImmediateAccess) {
            this.enableImmediateAccess = enableImmediateAccess;
            return this;
        }
        public Boolean getEnableImmediateAccess() {
            return this.enableImmediateAccess;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags self = new DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeEnterpriseSnapshotPolicyResponseBodyPolicies extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CrossRegionCopyInfo")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo crossRegionCopyInfo;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ManagedForEcs")
        public Boolean managedForEcs;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>the resource group</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetainRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule retainRule;

        @NameInMap("Schedule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule schedule;

        @NameInMap("SpecialRetainRules")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules specialRetainRules;

        @NameInMap("State")
        public String state;

        @NameInMap("StorageRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule storageRule;

        /**
         * <p>the pair tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags> tags;

        @NameInMap("TargetCount")
        public Integer targetCount;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeEnterpriseSnapshotPolicyResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyResponseBodyPolicies self = new DescribeEnterpriseSnapshotPolicyResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setCrossRegionCopyInfo(DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo crossRegionCopyInfo) {
            this.crossRegionCopyInfo = crossRegionCopyInfo;
            return this;
        }
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo getCrossRegionCopyInfo() {
            return this.crossRegionCopyInfo;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setManagedForEcs(Boolean managedForEcs) {
            this.managedForEcs = managedForEcs;
            return this;
        }
        public Boolean getManagedForEcs() {
            return this.managedForEcs;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setRetainRule(DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule retainRule) {
            this.retainRule = retainRule;
            return this;
        }
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule getRetainRule() {
            return this.retainRule;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setSchedule(DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule getSchedule() {
            return this.schedule;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setSpecialRetainRules(DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules specialRetainRules) {
            this.specialRetainRules = specialRetainRules;
            return this;
        }
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules getSpecialRetainRules() {
            return this.specialRetainRules;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setStorageRule(DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule storageRule) {
            this.storageRule = storageRule;
            return this;
        }
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule getStorageRule() {
            return this.storageRule;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setTags(java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags> getTags() {
            return this.tags;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setTargetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public Integer getTargetCount() {
            return this.targetCount;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
