// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2ResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is used to obtain the next page of backup policies.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The backup policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribePoliciesV2ResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
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
        public java.util.List<String> dataSourceIds;

        /**
         * <p>Data source type. The value range is as follows: </p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: Indicates ECS server backup. </li>
         * <li><strong>OSS</strong>: Indicates OSS backup. </li>
         * <li><strong>NAS</strong>: Indicates Alibaba Cloud NAS backup. </li>
         * <li><strong>ECS_FILE</strong>: Indicates ECS file backup. </li>
         * <li><strong>OTS</strong>: Indicates Tablestore backup.</li>
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
         * <li><strong>WEEKLY</strong>: weekly backups</li>
         * <li><strong>MONTHLY</strong>: monthly backups</li>
         * <li><strong>YEARLY</strong>: yearly backups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YEARLY</p>
         */
        @NameInMap("AdvancedRetentionType")
        public String advancedRetentionType;

        /**
         * <p>The special retention period of backups. Minimum value: 1. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>Indicates which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
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
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag matching rules, supporting: - <strong>EQUAL</strong>: Matches both the tag key and tag value. - <strong>NOT</strong>: Matches the tag key but not the tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Tag value.</p>
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
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>. This parameter indicates the time when data is dumped from a backup vault to an archive vault. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. It defines the data source filtering rule.</p>
         */
        @NameInMap("DataSourceFilters")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesDataSourceFilters> dataSourceFilters;

        /**
         * <p>This parameter is returned only if the <strong>PolicyType</strong> is <strong>UDM_ECS_ONLY</strong>. This parameter indicates whether the immutable backup feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Immutable")
        public Boolean immutable;

        /**
         * <p>Indicates whether the feature of keeping at least one backup version is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The feature is disabled.</li>
         * <li><strong>1</strong>: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>REPLICATION</strong>. This parameter indicates the ID of the destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
         * <ul>
         * <li>If the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>, this parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.</li>
         * <li>If the value of the <strong>RuleType</strong> parameter is <strong>REPLICATION</strong>, this parameter indicates the retention period of remote backups. Minimum value: 1. Unit: days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>. This parameter indicates the special retention rules.</p>
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
         * <p>The type of the rule. Each backup policy must have at least one rule of the <strong>BACKUP</strong> type and only one rule of the <strong>TRANSITION</strong> type. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP</strong>: backup rule</li>
         * <li><strong>TRANSITION</strong>: lifecycle rule</li>
         * <li><strong>REPLICATION</strong>: replication rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKUP</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1648647166|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. It defines the resource tag filtering rule.</p>
         */
        @NameInMap("TagFilters")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesTagFilters> tagFilters;

        /**
         * <p>This parameter is returned only if the value of the RuleType parameter is BACKUP. The ID of the backup vault.</p>
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
         * <p>The time when the backup policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1650248136</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The number of data sources that are bound to the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PolicyBindingCount")
        public Long policyBindingCount;

        /**
         * <p>The description of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data is backed up at 10:00:00 every day and replicated to the China (Shanghai) region for geo-redundancy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************bkz</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily Local Backup + Remote Backup</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: the general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.</li>
         * <li><strong>UDM_ECS_ONLY</strong>: the ECS instance backup policy. This type of policy applies only to ECS instance backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The rules in the backup policy.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRules> rules;

        /**
         * <p>The time when the backup policy was updated. The value is a UNIX timestamp. Unit: seconds.</p>
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
