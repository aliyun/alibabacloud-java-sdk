// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The pagination token (Token) returned for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>549BB71F-6778-53CE-AA73-E94ACE802AB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The snapshot copy destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of days to retain snapshots at the destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>Indicates whether cross-region copy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The destination region information.</p>
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
         * <p>The retention count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The retention time unit.</p>
         * 
         * <strong>example:</strong>
         * <p>DAYS</p>
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
         * <p>The cron expression.</p>
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
         * <p>The special period unit.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKS</p>
         */
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        /**
         * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The retention time unit.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKS</p>
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
         * <p>Indicates whether special retention is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Indicates whether instant access is enabled for snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * <p>The creation time in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-24T06:03:35Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The snapshot cross-region copy information.</p>
         */
        @NameInMap("CrossRegionCopyInfo")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesCrossRegionCopyInfo crossRegionCopyInfo;

        /**
         * <p>The snapshot policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The list of bound cloud disk IDs.</p>
         */
        @NameInMap("DiskIds")
        public java.util.List<String> diskIds;

        /**
         * <p>The snapshot managed status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ManagedForEcs")
        public Boolean managedForEcs;

        /**
         * <p>The snapshot policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The snapshot policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esp-xxx</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>the resource group</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The snapshot policy retention rule.</p>
         */
        @NameInMap("RetainRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesRetainRule retainRule;

        /**
         * <p>The snapshot policy schedule rule.</p>
         */
        @NameInMap("Schedule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSchedule schedule;

        /**
         * <p>The special retention rules for the snapshot policy.</p>
         */
        @NameInMap("SpecialRetainRules")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesSpecialRetainRules specialRetainRules;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>DISABLED</li>
         * <li>ENABLED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The snapshot policy storage rule.</p>
         */
        @NameInMap("StorageRule")
        public DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesStorageRule storageRule;

        /**
         * <p>the pair tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEnterpriseSnapshotPolicyResponseBodyPoliciesTags> tags;

        /**
         * <p>The number of bound targets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TargetCount")
        public Integer targetCount;

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>DISK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
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
