// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyV2Request extends TeaModel {
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
     * <p>po-000************viy</p>
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

    public static class UpdatePolicyV2RequestRulesDataSourceFilters extends TeaModel {
        @NameInMap("DataSourceIds")
        public java.util.List<String> dataSourceIds;

        /**
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static UpdatePolicyV2RequestRulesDataSourceFilters build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyV2RequestRulesDataSourceFilters self = new UpdatePolicyV2RequestRulesDataSourceFilters();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyV2RequestRulesDataSourceFilters setDataSourceIds(java.util.List<String> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }
        public java.util.List<String> getDataSourceIds() {
            return this.dataSourceIds;
        }

        public UpdatePolicyV2RequestRulesDataSourceFilters setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class UpdatePolicyV2RequestRulesRetentionRules extends TeaModel {
        /**
         * <p>The type of the special retention rule. Valid values:</p>
         * <ul>
         * <li><strong>WEEKLY</strong>: retains weekly backups</li>
         * <li><strong>MONTHLY</strong>: retains monthly backups</li>
         * <li><strong>YEARLY</strong>: retains yearly backups</li>
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
         * <p>365</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>Specifies which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    public static class UpdatePolicyV2RequestRulesTagFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdatePolicyV2RequestRulesTagFilters build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyV2RequestRulesTagFilters self = new UpdatePolicyV2RequestRulesTagFilters();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyV2RequestRulesTagFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePolicyV2RequestRulesTagFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdatePolicyV2RequestRulesTagFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdatePolicyV2RequestRules extends TeaModel {
        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the time when data is dumped from a backup vault to an archive vault. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the time when data is dumped from a backup vault to a cold archive vault. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("ColdArchiveDays")
        public Long coldArchiveDays;

        @NameInMap("DataSourceFilters")
        public java.util.List<UpdatePolicyV2RequestRulesDataSourceFilters> dataSourceFilters;

        @NameInMap("Immutable")
        public Boolean immutable;

        /**
         * <p>Specifies whether to enable the feature of keeping at least one backup version. Valid values:</p>
         * <ul>
         * <li>0: The feature is disabled.</li>
         * <li>1: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>. This parameter specifies the ID of the destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
         * <ul>
         * <li>If the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>, this parameter specifies the retention period of the backup data. Minimum value: 1. Unit: days.</li>
         * <li>If the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>, this parameter specifies the retention period of remote backups. Minimum value: 1. Unit: days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the special retention rules.</p>
         */
        @NameInMap("RetentionRules")
        public java.util.List<UpdatePolicyV2RequestRulesRetentionRules> retentionRules;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-000************rof</p>
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
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of 1 hour. P1D specifies an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1648647166|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        @NameInMap("TagFilters")
        public java.util.List<UpdatePolicyV2RequestRulesTagFilters> tagFilters;

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

        public UpdatePolicyV2RequestRules setDataSourceFilters(java.util.List<UpdatePolicyV2RequestRulesDataSourceFilters> dataSourceFilters) {
            this.dataSourceFilters = dataSourceFilters;
            return this;
        }
        public java.util.List<UpdatePolicyV2RequestRulesDataSourceFilters> getDataSourceFilters() {
            return this.dataSourceFilters;
        }

        public UpdatePolicyV2RequestRules setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
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

        public UpdatePolicyV2RequestRules setTagFilters(java.util.List<UpdatePolicyV2RequestRulesTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public java.util.List<UpdatePolicyV2RequestRulesTagFilters> getTagFilters() {
            return this.tagFilters;
        }

    }

}
