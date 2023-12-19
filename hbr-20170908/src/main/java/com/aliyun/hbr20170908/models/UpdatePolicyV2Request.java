// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyV2Request extends TeaModel {
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
    public java.util.List<UpdatePolicyV2RequestRules> rules;

    public static UpdatePolicyV2Request build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyV2Request self = new UpdatePolicyV2Request();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyV2Request setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public UpdatePolicyV2Request setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyV2Request setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyV2Request setRules(java.util.List<UpdatePolicyV2RequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdatePolicyV2RequestRules> getRules() {
        return this.rules;
    }

    public static class UpdatePolicyV2RequestRulesRetentionRules extends TeaModel {
        /**
         * <p>The type of the special retention rule. Valid values:</p>
         * <br>
         * <p>*   **WEEKLY**: weekly backups</p>
         * <p>*   **MONTHLY**: monthly backups</p>
         * <p>*   **YEARLY**: yearly backups</p>
         */
        @NameInMap("AdvancedRetentionType")
        public String advancedRetentionType;

        /**
         * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>Specifies which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
         */
        @NameInMap("WhichSnapshot")
        public Long whichSnapshot;

        public static UpdatePolicyV2RequestRulesRetentionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyV2RequestRulesRetentionRules self = new UpdatePolicyV2RequestRulesRetentionRules();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyV2RequestRulesRetentionRules setAdvancedRetentionType(String advancedRetentionType) {
            this.advancedRetentionType = advancedRetentionType;
            return this;
        }
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        public UpdatePolicyV2RequestRulesRetentionRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public UpdatePolicyV2RequestRulesRetentionRules setWhichSnapshot(Long whichSnapshot) {
            this.whichSnapshot = whichSnapshot;
            return this;
        }
        public Long getWhichSnapshot() {
            return this.whichSnapshot;
        }

    }

    public static class UpdatePolicyV2RequestRules extends TeaModel {
        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the time when data is dumped from a backup vault to an archive vault. Unit: days.</p>
         */
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **BACKUP**. This parameter specifies the backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the time when data is dumped from a backup vault to a cold archive vault. Unit: days.</p>
         */
        @NameInMap("ColdArchiveDays")
        public Long coldArchiveDays;

        /**
         * <p>Specifies whether to enable the feature of keeping at least one backup version. Valid values:</p>
         * <br>
         * <p>*   0: The feature is disabled.</p>
         * <p>*   1: The feature is enabled.</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **REPLICATION**. This parameter specifies the ID of the destination region.</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **TRANSITION** or **REPLICATION**.</p>
         * <br>
         * <p>*   If the **RuleType** parameter is set to **TRANSITION**, this parameter specifies the retention period of the backup data. Minimum value: 1. Unit: days.</p>
         * <p>*   If the **RuleType** parameter is set to **REPLICATION**, this parameter specifies the retention period of remote backups. Minimum value: 1. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the special retention rules.</p>
         */
        @NameInMap("RetentionRules")
        public java.util.List<UpdatePolicyV2RequestRulesRetentionRules> retentionRules;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The type of the rule. Each backup policy must have at least one rule of the **BACKUP** type and only one rule of the **TRANSITION** type.</p>
         * <br>
         * <p>*   **BACKUP**: backup rule</p>
         * <p>*   **TRANSITION**: lifecycle rule</p>
         * <p>*   **REPLICATION**: replication rule</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is required only if the **RuleType** parameter is set to **BACKUP**. This parameter specifies the backup schedule settings. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>*   startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</p>
         * <p>*   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        public static UpdatePolicyV2RequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyV2RequestRules self = new UpdatePolicyV2RequestRules();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyV2RequestRules setArchiveDays(Long archiveDays) {
            this.archiveDays = archiveDays;
            return this;
        }
        public Long getArchiveDays() {
            return this.archiveDays;
        }

        public UpdatePolicyV2RequestRules setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public UpdatePolicyV2RequestRules setColdArchiveDays(Long coldArchiveDays) {
            this.coldArchiveDays = coldArchiveDays;
            return this;
        }
        public Long getColdArchiveDays() {
            return this.coldArchiveDays;
        }

        public UpdatePolicyV2RequestRules setKeepLatestSnapshots(Long keepLatestSnapshots) {
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        public UpdatePolicyV2RequestRules setReplicationRegionId(String replicationRegionId) {
            this.replicationRegionId = replicationRegionId;
            return this;
        }
        public String getReplicationRegionId() {
            return this.replicationRegionId;
        }

        public UpdatePolicyV2RequestRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public UpdatePolicyV2RequestRules setRetentionRules(java.util.List<UpdatePolicyV2RequestRulesRetentionRules> retentionRules) {
            this.retentionRules = retentionRules;
            return this;
        }
        public java.util.List<UpdatePolicyV2RequestRulesRetentionRules> getRetentionRules() {
            return this.retentionRules;
        }

        public UpdatePolicyV2RequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdatePolicyV2RequestRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public UpdatePolicyV2RequestRules setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

    }

}
