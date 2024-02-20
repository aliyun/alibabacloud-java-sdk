// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2ResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of results for each query.</p>
     * <br>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is used to obtain the next page of backup policies.</p>
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
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
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

    public static class DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules extends TeaModel {
        /**
         * <p>The type of the special retention rule. Valid values:</p>
         * <br>
         * <p>*   **WEEKLY**: weekly backups.</p>
         * <p>*   **MONTHLY**: monthly backups.</p>
         * <p>*   **YEARLY**: yearly backups.</p>
         */
        @NameInMap("AdvancedRetentionType")
        public String advancedRetentionType;

        /**
         * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>Indicates which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
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

    public static class DescribePoliciesV2ResponseBodyPoliciesRules extends TeaModel {
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is returned only if the value of the **RuleType** parameter is **BACKUP**. This parameter indicates the backup type. Only **COMPLETE** may be returned, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>Indicates whether the feature of keeping at least one backup version is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: This feature is disabled.</p>
         * <p>*   **1**: This feature is enabled.</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is returned only if the value of the **RuleType** parameter is **REPLICATION**. This parameter indicates the ID of the destination region.</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is returned only if the value of the **RuleType** parameter is **TRANSITION** or **REPLICATION**.</p>
         * <br>
         * <p>*   If the value of the **RuleType** parameter is **TRANSITION**, this parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.</p>
         * <p>*   If the value of the **RuleType** parameter is **REPLICATION**, this parameter indicates the retention period of remote backups. Minimum value: 1. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is returned only if the value of the **RuleType** parameter is **TRANSITION**. This parameter indicates the special retention rules.</p>
         */
        @NameInMap("RetentionRules")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRulesRetentionRules> retentionRules;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The type of the rule. Each backup policy must have at least one rule of the **BACKUP** type and only one rule of the **TRANSITION** type.</p>
         * <br>
         * <p>*   **BACKUP**: the backup rule.</p>
         * <p>*   **TRANSITION**: the lifecycle rule.</p>
         * <p>*   **REPLICATION**: the replication rule.</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is returned only if the value of the **RuleType** parameter is **BACKUP**. This parameter indicates the scheduling settings for the backups. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>*   startTime: the time when the system starts to run a backup job. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>*   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

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
         * <p>The time when the backup policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The number of data sources that are bound to the backup policy.</p>
         */
        @NameInMap("PolicyBindingCount")
        public Long policyBindingCount;

        /**
         * <p>The description of the backup policy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The ID of the backup policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the backup policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The rules in the backup policy.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribePoliciesV2ResponseBodyPoliciesRules> rules;

        /**
         * <p>The time when the backup policy was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
