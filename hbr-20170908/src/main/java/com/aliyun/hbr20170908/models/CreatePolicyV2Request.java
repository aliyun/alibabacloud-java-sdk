// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyV2Request extends TeaModel {
    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>Backup once every day at 10:00 AM, with cross-region backup to Shanghai.</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily local backup + geo-redundancy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: general backup policy. Supports backing up data sources other than ECS instances.</li>
     * <li><strong>UDM_ECS_ONLY</strong>: ECS instance backup policy. Supports backing up only ECS instances.</li>
     * </ul>
     * <p>If you do not specify the policy type, Cloud Backup automatically sets the policy type based on whether a backup vault is specified in the policy rules:</p>
     * <ul>
     * <li>A backup vault is specified in the policy rules: <strong>STANDARD</strong></li>
     * <li>No backup vault is specified in the policy rules: <strong>UDM_ECS_ONLY</strong></li>
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

    public static class CreatePolicyV2RequestRulesDataSourceFiltersAccounts extends TeaModel {
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        public String crossAccountType;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        public static CreatePolicyV2RequestRulesDataSourceFiltersAccounts build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyV2RequestRulesDataSourceFiltersAccounts self = new CreatePolicyV2RequestRulesDataSourceFiltersAccounts();
            return TeaModel.build(map, self);
        }

        public CreatePolicyV2RequestRulesDataSourceFiltersAccounts setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public CreatePolicyV2RequestRulesDataSourceFiltersAccounts setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public CreatePolicyV2RequestRulesDataSourceFiltersAccounts setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

    }

    public static class CreatePolicyV2RequestRulesDataSourceFilters extends TeaModel {
        @NameInMap("AccountScope")
        public String accountScope;

        @NameInMap("Accounts")
        public java.util.List<CreatePolicyV2RequestRulesDataSourceFiltersAccounts> accounts;

        /**
         * <p>Deprecated.</p>
         */
        @NameInMap("DataSourceIds")
        @Deprecated
        public java.util.List<String> dataSourceIds;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup. This data source type is supported only when <strong>PolicyType</strong> is set to <strong>UDM_ECS_ONLY</strong>.</li>
         * <li><strong>OSS</strong>: OSS backup. This data source type is supported only when <strong>PolicyType</strong> is set to <strong>STANDARD</strong>.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup. This data source type is supported only when <strong>PolicyType</strong> is set to <strong>STANDARD</strong>.</li>
         * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition. This data source type is supported only when <strong>PolicyType</strong> is set to <strong>STANDARD</strong>.</li>
         * <li><strong>OTS</strong>: Tablestore backup. This data source type is supported only when <strong>PolicyType</strong> is set to <strong>STANDARD</strong>.</li>
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

        public CreatePolicyV2RequestRulesDataSourceFilters setAccountScope(String accountScope) {
            this.accountScope = accountScope;
            return this;
        }
        public String getAccountScope() {
            return this.accountScope;
        }

        public CreatePolicyV2RequestRulesDataSourceFilters setAccounts(java.util.List<CreatePolicyV2RequestRulesDataSourceFiltersAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<CreatePolicyV2RequestRulesDataSourceFiltersAccounts> getAccounts() {
            return this.accounts;
        }

        @Deprecated
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
         * <li><strong>DAILY</strong>: daily backup.</li>
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
         * <p>The backup to which the rule applies. Currently, only the first backup is supported. Set the value to 1.</p>
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
         * <p>The tag matching rule. Valid values:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: matches both the tag key and tag value.</li>
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
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The number of days after which a backup is automatically moved to the archive tier. Backups must be retained in the standard tier for at least 30 days and in the archive tier for at least 60 days. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ArchiveDays")
        public Long archiveDays;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup type. Set the value to <strong>COMPLETE</strong>, which specifies full backup.</p>
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
        public java.util.List<CreatePolicyV2RequestRulesDataSourceFilters> dataSourceFilters;

        /**
         * <p>This parameter is required only when <strong>PolicyType</strong> is set to <strong>UDM_ECS_ONLY</strong> and <strong>RuleType</strong> is set to <strong>SECURITY</strong>. Specifies whether to enable backup locking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Immutable")
        public Boolean immutable;

        /**
         * <p>Specifies whether to retain at least one backup version. Valid values:</p>
         * <ul>
         * <li>0: do not retain.</li>
         * <li>1: retain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>REPLICATION</strong>. The ID of the destination region for replication.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ReplicationRegionId")
        public String replicationRegionId;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>, <strong>TRANSITION</strong>, or <strong>REPLICATION</strong>.</p>
         * <ul>
         * <li>If <strong>RuleType</strong> is set to <strong>BACKUP</strong>: the retention period of backups. The priority of this parameter is lower than the Retention parameter of the rule whose <strong>RuleType</strong> is <strong>TRANSITION</strong>. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
         * <li>If <strong>RuleType</strong> is set to <strong>TRANSITION</strong>: the retention period of backups. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
         * <li>If <strong>RuleType</strong> is set to <strong>REPLICATION</strong>: the retention period of cross-region backups. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The special retention rules.</p>
         */
        @NameInMap("RetentionRules")
        public java.util.List<CreatePolicyV2RequestRulesRetentionRules> retentionRules;

        /**
         * <p>The rule type. Each policy must have at least one <strong>BACKUP</strong> rule and exactly one <strong>TRANSITION</strong> rule. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP</strong>: backup rule.</li>
         * <li><strong>TRANSITION</strong>: lifecycle rule.</li>
         * <li><strong>REPLICATION</strong>: replication rule.</li>
         * <li><strong>TAG</strong>: tag-based resource association rule.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKUP</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup schedule settings. Supported formats:</p>
         * <ul>
         * <li><p><code>I|{startTime}|{interval}</code>: specifies that a backup job is executed at the specified interval starting from {startTime}. For example, <code>I|1631685600|P1D</code> specifies that a backup job is executed once a day starting from 2021-09-15 14:00:00.</p>
         * <ul>
         * <li>startTime: the start time of the backup. This value is a UNIX timestamp. Unit: seconds.</li>
         * <li>interval: the ISO 8601 time interval. For example, <code>PT1H</code> specifies an interval of one hour. <code>P1D</code> specifies an interval of one day.</li>
         * </ul>
         * </li>
         * <li><p><code>C|{startTime}|{crontab}</code>: specifies that a backup job is executed based on the {crontab} expression starting from {startTime}. For example, <code>C|1631685600|0 0 2 ? * 3,5,7</code> specifies that a backup job is executed at 02:00:00 every Tuesday, Thursday, and Saturday starting from 2021-09-15 14:00:00.</p>
         * <ul>
         * <li>startTime: the start time of the backup. This value is a UNIX timestamp. Unit: seconds.</li>
         * <li>crontab: the crontab expression. For example, <code>0 0 2 ? * 3,5,7</code> specifies every Tuesday, Thursday, and Saturday at 02:00:00.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Backup jobs that are missed are not compensated. If the previous backup job is not complete, the next backup job is not triggered.</p>
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
        public java.util.List<CreatePolicyV2RequestRulesTagFilters> tagFilters;

        /**
         * <p>This parameter is required only when RuleType is set to BACKUP. The backup vault ID.</p>
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

        public CreatePolicyV2RequestRules setArchiveDays(Long archiveDays) {
            this.archiveDays = archiveDays;
            return this;
        }
        public Long getArchiveDays() {
            return this.archiveDays;
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
