// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The returned enterprise-level snapshot policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the destination region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The retention period of snapshot copies in the destination region. Unit: day.</p>
         */
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
        /**
         * <p>Indicates whether the cross-region replication feature is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The destination regions that store snapshot copies.</p>
         */
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
        /**
         * <p>The maximum number of snapshots that can be retained.</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The value of the retention period of snapshots.</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The unit of the retention period of snapshots.</p>
         */
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
        /**
         * <p>The cron expression of the enterprise-level snapshot policy.</p>
         */
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
        /**
         * <p>The unit of the special retention period.</p>
         */
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        /**
         * <p>The value of the retention period.</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The unit of the retention period.</p>
         */
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
        /**
         * <p>Indicates whether the special retention period is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The special retention rules.</p>
         */
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
        /**
         * <p>Indicates whether the instant access feature is enabled.</p>
         */
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
        /**
         * <p>The key of the tag of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag of the enterprise-level snapshot policy.</p>
         */
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
        /**
         * <p>The time when the enterprise-level snapshot policy was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The replication rule of snapshots in the enterprise-level snapshot policy.</p>
         */
        @NameInMap("CrossRegionCopyInfo")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo crossRegionCopyInfo;

        /**
         * <p>The description of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The list of disks.</p>
         */
        @NameInMap("DiskIds")
        public java.util.List<String> diskIds;

        /**
         * <p>Indicates whether snapshots are managed.</p>
         */
        @NameInMap("ManagedForEcs")
        public Boolean managedForEcs;

        /**
         * <p>The name of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>the resource group</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retention rule of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("RetainRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule retainRule;

        /**
         * <p>The scheduling rule of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("Schedule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule schedule;

        /**
         * <p>The special retention rules of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("SpecialRetainRules")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules specialRetainRules;

        /**
         * <p>The status of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The storage rule of snapshots in the enterprise-level snapshot policy.</p>
         */
        @NameInMap("StorageRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule storageRule;

        /**
         * <p>the pair tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags> tags;

        /**
         * <p>The number of objects that are associated with the enterprise-level snapshot policy.</p>
         */
        @NameInMap("TargetCount")
        public Integer targetCount;

        /**
         * <p>The type of the enterprise-level snapshot policy.</p>
         */
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

        public DescribeEnterpriseSnapshotPolicyResponseBodyPolicies setDiskIds(java.util.List<String> diskIds) {
            this.diskIds = diskIds;
            return this;
        }
        public java.util.List<String> getDiskIds() {
            return this.diskIds;
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
