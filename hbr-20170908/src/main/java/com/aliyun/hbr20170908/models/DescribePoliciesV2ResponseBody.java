// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2ResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message. The value &quot;successful&quot; is returned for a successful request. An error message is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token required to retrieve the next page of policies.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribePoliciesV2ResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePoliciesV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesV2ResponseBody self = new DescribePoliciesV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePoliciesV2ResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePoliciesV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePoliciesV2ResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePoliciesV2ResponseBody setPolicies(java.util.List<DescribePoliciesV2ResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribePoliciesV2ResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribePoliciesV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePoliciesV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePoliciesV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters extends TeaModel {
        /**
         * <p>Deprecated.</p>
         */
        @NameInMap("DataSourceIds")
        @Deprecated
        public java.util.List<String> dataSourceIds;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
         * <li><strong>OSS</strong>: OSS backup.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
         * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
         * <li><strong>OTS</strong>: Tablestore backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters self = new DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters setDataSourceIds(java.util.List<String> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }
        public java.util.List<String> getDataSourceIds() {
            return this.dataSourceIds;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules extends TeaModel {
        /**
         * <p>The type of the special retention rule. Valid values:</p>
         * <ul>
         * <li><strong>WEEKLY</strong>: weekly backup.</li>
         * <li><strong>MONTHLY</strong>: monthly backup.</li>
         * <li><strong>YEARLY</strong>: yearly backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YEARLY</p>
         */
        @NameInMap("AdvancedRetentionType")
        public String advancedRetentionType;

        /**
         * <p>The special retention period of the backup. Minimum value: 1. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The backup to which the rule applies. Currently, only the first backup is supported. The value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WhichSnapshot")
        public Long whichSnapshot;

        public static DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules self = new DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules setAdvancedRetentionType(String advancedRetentionType) {
            this.advancedRetentionType = advancedRetentionType;
            return this;
        }
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules setWhichSnapshot(Long whichSnapshot) {
            this.whichSnapshot = whichSnapshot;
            return this;
        }
        public Long getWhichSnapshot() {
            return this.whichSnapshot;
        }

    }

    public static class DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag matching rule. Valid values:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: matches both the tag key and the tag value.</li>
         * <li><strong>NOT</strong>: matches the tag key but not the tag value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The tag value. An empty value indicates any value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters self = new DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePoliciesV2ResponseBodyPoliciesRules extends TeaModel {
        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The number of days after which the backup is converted to archive storage. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup type. The value is <strong>COMPLETE</strong>, which indicates a full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. The data source filter rules.</p>
         */
        @NameInMap("DataSourceFilters")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters> dataSourceFilters;

        /**
         * <p>This parameter is valid only when <strong>PolicyType</strong> is set to <strong>UDM_ECS_ONLY</strong>. Specifies whether to enable backup locking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Immutable")
        public Boolean immutable;

        /**
         * <p>Specifies whether to retain at least one backup version. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Do not retain.</li>
         * <li><strong>1</strong>: Retain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>REPLICATION</strong>. The destination region ID for replication.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
         * <ul>
         * <li><strong>RuleType</strong> is set to <strong>TRANSITION</strong>: the retention period of the backup. Minimum value: 1. Unit: days.</li>
         * <li><strong>RuleType</strong> is set to <strong>REPLICATION</strong>: the retention period of the geo-redundancy backup. Minimum value: 1. Unit: days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The list of special retention rules.</p>
         */
        @NameInMap("RetentionRules")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules> retentionRules;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-000************f1e</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule type. Each policy must have at least one <strong>BACKUP</strong> rule and exactly one <strong>TRANSITION</strong> rule. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP</strong>: backup rule.</li>
         * <li><strong>TRANSITION</strong>: lifecycle rule.</li>
         * <li><strong>REPLICATION</strong>: replication rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKUP</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup schedule. Optional format: <code>I|{startTime}|{interval}</code>. This indicates that a backup job is executed at every {interval} starting from {startTime}. Backup jobs for past time periods are not compensated. If the previous backup job is not completed, the next backup job is not triggered. For example, <code>I|1631685600|P1D</code> indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
         * <ul>
         * <li>startTime: the start time of the backup. UNIX timestamp, in seconds.</li>
         * <li>interval: the ISO 8601 time interval. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1648647166|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. The resource tag filter rules.</p>
         */
        @NameInMap("TagFilters")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters> tagFilters;

        /**
         * <p>This parameter is required only when RuleType is set to BACKUP. The backup vault ID.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000**************kgm</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribePoliciesV2ResponseBodyPoliciesRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2ResponseBodyPoliciesRules self = new DescribePoliciesV2ResponseBodyPoliciesRules();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setArchiveDays(Long archiveDays) {
            this.archiveDays = archiveDays;
            return this;
        }
        public Long getArchiveDays() {
            return this.archiveDays;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setDataSourceFilters(java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters> dataSourceFilters) {
            this.dataSourceFilters = dataSourceFilters;
            return this;
        }
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters> getDataSourceFilters() {
            return this.dataSourceFilters;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setKeepLatestSnapshots(Long keepLatestSnapshots) {
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setReplicationRegionId(String replicationRegionId) {
            this.replicationRegionId = replicationRegionId;
            return this;
        }
        public String getReplicationRegionId() {
            return this.replicationRegionId;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setRetentionRules(java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules> retentionRules) {
            this.retentionRules = retentionRules;
            return this;
        }
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules> getRetentionRules() {
            return this.retentionRules;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setTagFilters(java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters> getTagFilters() {
            return this.tagFilters;
        }

        public DescribePoliciesV2ResponseBodyPoliciesRules setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribePoliciesV2ResponseBodyPolicies extends TeaModel {
        /**
         * <p>The user business status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The creation time. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1650248136</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The number of data sources bound to the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PolicyBindingCount")
        public Long policyBindingCount;

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Back up every day at 10:00 AM and replicate to Shanghai</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************bkz</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily backup + geo-redundancy backup</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: general backup policy. Supports backing up data sources other than ECS instance backup.</li>
         * <li><strong>UDM_ECS_ONLY</strong>: ECS instance backup policy. Supports backing up only ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The list of policy rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRules> rules;

        /**
         * <p>The update time. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1662080404</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribePoliciesV2ResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2ResponseBodyPolicies self = new DescribePoliciesV2ResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesV2ResponseBodyPolicies setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePoliciesV2ResponseBodyPolicies setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribePoliciesV2ResponseBodyPolicies setPolicyBindingCount(Long policyBindingCount) {
            this.policyBindingCount = policyBindingCount;
            return this;
        }
        public Long getPolicyBindingCount() {
            return this.policyBindingCount;
        }

        public DescribePoliciesV2ResponseBodyPolicies setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePoliciesV2ResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribePoliciesV2ResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePoliciesV2ResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DescribePoliciesV2ResponseBodyPolicies setRules(java.util.List<DescribePoliciesV2ResponseBodyPoliciesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRules> getRules() {
            return this.rules;
        }

        public DescribePoliciesV2ResponseBodyPolicies setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
