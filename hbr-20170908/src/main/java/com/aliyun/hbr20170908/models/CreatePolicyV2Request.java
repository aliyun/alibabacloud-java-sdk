// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyV2Request extends TeaModel {
    /**
     * <p>The description of the backup policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Data is backed up at 10:00:00 every day and replicated to the China (Shanghai) region for geo-redundancy.</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

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
     * <li><strong>UDM_ECS_ONLY</strong>: This type of policy applies only to ECS instance backup.</li>
     * </ul>
     * <p>If the policy type is not specified, Cloud Backup automatically sets the policy type based on whether the backup vault is specified in the rules of the policy:</p>
     * <ul>
     * <li>If the backup vault is specified, Cloud Backup sets the policy type to <strong>STANDARD</strong>.</li>
     * <li>If the backup vault is not specified, Cloud Backup sets the policy type to <strong>UDM_ECS_ONLY</strong>.</li>
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
    public java.util.List<CreatePolicyV2RequestRules> rules;

    public static CreatePolicyV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyV2Request self = new CreatePolicyV2Request();
        return TeaModel.build(map, self);
    }

    public CreatePolicyV2Request setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public CreatePolicyV2Request setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyV2Request setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreatePolicyV2Request setRules(java.util.List<CreatePolicyV2RequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreatePolicyV2RequestRules> getRules() {
        return this.rules;
    }

    public static class CreatePolicyV2RequestRulesDataSourceFilters extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("DataSourceIds")
        public java.util.List<String> dataSourceIds;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: Elastic Compute Service (ECS) instance This type of data source is supported only if the <strong>PolicyType</strong> parameter is set to <strong>UDM_ECS_ONLY</strong>.</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) bucket This type of data source is supported only if the <strong>PolicyType</strong> parameter is set to <strong>STANDARD</strong>.</li>
         * <li><strong>NAS</strong>: File Storage NAS (NAS) file system This type of data source is supported only if the <strong>PolicyType</strong> parameter is set to <strong>STANDARD</strong>.</li>
         * <li><strong>ECS_FILE</strong>: ECS file This type of data source is supported only if the <strong>PolicyType</strong> parameter is set to <strong>STANDARD</strong>.</li>
         * <li><strong>OTS</strong>: Tablestore instance This type of data source is supported only if the <strong>PolicyType</strong> parameter is set to <strong>STANDARD</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static CreatePolicyV2RequestRulesDataSourceFilters build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyV2RequestRulesDataSourceFilters self = new CreatePolicyV2RequestRulesDataSourceFilters();
            return TeaModel.build(map, self);
        }

        public CreatePolicyV2RequestRulesDataSourceFilters setDataSourceIds(java.util.List<String> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }
        public java.util.List<String> getDataSourceIds() {
            return this.dataSourceIds;
        }

        public CreatePolicyV2RequestRulesDataSourceFilters setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class CreatePolicyV2RequestRulesRetentionRules extends TeaModel {
        /**
         * <p>The type of the special retention rule. Valid values:</p>
         * <ul>
         * <li><strong>DAILY</strong>: retains daily backups</li>
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
         * <p>730</p>
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

        public static CreatePolicyV2RequestRulesRetentionRules build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyV2RequestRulesRetentionRules self = new CreatePolicyV2RequestRulesRetentionRules();
            return TeaModel.build(map, self);
        }

        public CreatePolicyV2RequestRulesRetentionRules setAdvancedRetentionType(String advancedRetentionType) {
            this.advancedRetentionType = advancedRetentionType;
            return this;
        }
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        public CreatePolicyV2RequestRulesRetentionRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public CreatePolicyV2RequestRulesRetentionRules setWhichSnapshot(Long whichSnapshot) {
            this.whichSnapshot = whichSnapshot;
            return this;
        }
        public Long getWhichSnapshot() {
            return this.whichSnapshot;
        }

    }

    public static class CreatePolicyV2RequestRulesTagFilters extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag-based matching rule. Valid values:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: Both the tag key and tag value are matched.</li>
         * <li><strong>NOT</strong>: The tag key is matched and the tag value is not matched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The tag value. If you leave this parameter empty, the value is any value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePolicyV2RequestRulesTagFilters build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyV2RequestRulesTagFilters self = new CreatePolicyV2RequestRulesTagFilters();
            return TeaModel.build(map, self);
        }

        public CreatePolicyV2RequestRulesTagFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePolicyV2RequestRulesTagFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreatePolicyV2RequestRulesTagFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreatePolicyV2RequestRules extends TeaModel {
        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TAG</strong>. This parameter specifies the data source filter rule.</p>
         */
        @NameInMap("DataSourceFilters")
        public java.util.List<CreatePolicyV2RequestRulesDataSourceFilters> dataSourceFilters;

        /**
         * <p>This parameter is required only if the <strong>PolicyType</strong> parameter is set to <strong>UDM_ECS_ONLY</strong>. This parameter specifies whether to enable the immutable backup feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>, <strong>TRANSITION</strong>, or <strong>REPLICATION</strong>.</p>
         * <ul>
         * <li>If the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>, this parameter specifies the retention period of the backup data. The priority is lower than the retention period when the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
         * <li>If the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>, this parameter specifies the retention period of the backup data. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
         * <li>If the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>, this parameter specifies the retention period of remote backups. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
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
        public java.util.List<CreatePolicyV2RequestRulesRetentionRules> retentionRules;

        /**
         * <p>The type of the rule. Each backup policy must have at least one rule of the <strong>BACKUP</strong> type and only one rule of the <strong>TRANSITION</strong> type. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP</strong>: backup rule</li>
         * <li><strong>TRANSITION</strong>: lifecycle rule</li>
         * <li><strong>REPLICATION</strong>: replication rule</li>
         * <li><strong>TAG</strong>: tag-based resource association rule</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKUP</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup schedule settings. Formats:</p>
         * <ul>
         * <li><p><code>I|{startTime}|{interval}</code>: The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, <code>PT1H</code> specifies an interval of 1 hour. <code>P1D</code> specifies an interval of one day.</li>
         * </ul>
         * </li>
         * <li><p><code>C|{startTime}|{crontab}</code>: The system runs backup jobs at a point in time that is specified in the {startTime} parameter based on the {crontab} expression. For example, C|1631685600|0 0 2 ?\* 3,5,7 indicates that the system runs backup jobs at 02:00:00 every Tuesday, Thursday, and Saturday from14:00:00 on September 15, 2021.``</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
         * <li>crontab: the crontab expression. For example, 0 0 2 ?\* 3,5,7 indicates 02:00:00 every Tuesday, Thursday, and Saturday.``</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>I|1648647166|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TAG</strong>. This parameter specifies the resource tag filter rule.</p>
         */
        @NameInMap("TagFilters")
        public java.util.List<CreatePolicyV2RequestRulesTagFilters> tagFilters;

        /**
         * <p>This parameter is required only if the RuleType parameter is set to BACKUP. The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0001************aseg</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static CreatePolicyV2RequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyV2RequestRules self = new CreatePolicyV2RequestRules();
            return TeaModel.build(map, self);
        }

        public CreatePolicyV2RequestRules setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public CreatePolicyV2RequestRules setDataSourceFilters(java.util.List<CreatePolicyV2RequestRulesDataSourceFilters> dataSourceFilters) {
            this.dataSourceFilters = dataSourceFilters;
            return this;
        }
        public java.util.List<CreatePolicyV2RequestRulesDataSourceFilters> getDataSourceFilters() {
            return this.dataSourceFilters;
        }

        public CreatePolicyV2RequestRules setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public CreatePolicyV2RequestRules setKeepLatestSnapshots(Long keepLatestSnapshots) {
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        public CreatePolicyV2RequestRules setReplicationRegionId(String replicationRegionId) {
            this.replicationRegionId = replicationRegionId;
            return this;
        }
        public String getReplicationRegionId() {
            return this.replicationRegionId;
        }

        public CreatePolicyV2RequestRules setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public CreatePolicyV2RequestRules setRetentionRules(java.util.List<CreatePolicyV2RequestRulesRetentionRules> retentionRules) {
            this.retentionRules = retentionRules;
            return this;
        }
        public java.util.List<CreatePolicyV2RequestRulesRetentionRules> getRetentionRules() {
            return this.retentionRules;
        }

        public CreatePolicyV2RequestRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CreatePolicyV2RequestRules setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public CreatePolicyV2RequestRules setTagFilters(java.util.List<CreatePolicyV2RequestRulesTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public java.util.List<CreatePolicyV2RequestRulesTagFilters> getTagFilters() {
            return this.tagFilters;
        }

        public CreatePolicyV2RequestRules setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
