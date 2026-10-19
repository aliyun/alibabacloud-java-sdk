// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupPolicyRequest extends TeaModel {
    /**
     * <p>The list of backup policies.</p>
     */
    @NameInMap("AdvancedBackupDataPolicies")
    public java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies> advancedBackupDataPolicies;

    /**
     * <p>The list of log backup policies.</p>
     */
    @NameInMap("AdvancedBackupLogPolicies")
    public java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies> advancedBackupLogPolicies;

    /**
     * <p>The backup retention policy. Valid values:</p>
     * <ul>
     * <li>0: All backup sets of the instance are deleted immediately when the instance is released.</li>
     * <li>1: The last backup set is retained for long-term retention (LTR) when the instance is released.</li>
     * <li>2: All backup sets are retained for long-term retention (LTR) when the instance is released.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-2zeb2d64cb46xxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The time period during which the backup is performed. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
     * <blockquote>
     * <p>The time range is limited to 1 hour.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: backup within seconds.</li>
     * <li><strong>Standard</strong>: standard backup. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    public static ModifyAdvancedBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupPolicyRequest self = new ModifyAdvancedBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupPolicyRequest setAdvancedBackupDataPolicies(java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies> advancedBackupDataPolicies) {
        this.advancedBackupDataPolicies = advancedBackupDataPolicies;
        return this;
    }
    public java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies> getAdvancedBackupDataPolicies() {
        return this.advancedBackupDataPolicies;
    }

    public ModifyAdvancedBackupPolicyRequest setAdvancedBackupLogPolicies(java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies> advancedBackupLogPolicies) {
        this.advancedBackupLogPolicies = advancedBackupLogPolicies;
        return this;
    }
    public java.util.List<ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies> getAdvancedBackupLogPolicies() {
        return this.advancedBackupLogPolicies;
    }

    public ModifyAdvancedBackupPolicyRequest setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyAdvancedBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAdvancedBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyAdvancedBackupPolicyRequest setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    public static class ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies extends TeaModel {
        /**
         * <p>The action. Valid values:</p>
         * <ul>
         * <li><strong>CREATE</strong>: Creates a policy.</li>
         * <li><strong>UPDATE</strong>: Updates a policy.</li>
         * <li><strong>DELETE</strong>: Deletes a policy. If this value is specified, only the PolicyId parameter is required.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The scheduling type of the advanced policy. Valid values:</p>
         * <ul>
         * <li>dayOfWeek: scheduled by week.</li>
         * <li>dayOfMonth: scheduled by month.</li>
         * <li>dayOfYear: scheduled by year.</li>
         * <li>backupInterval: scheduled at a fixed interval (high-frequency backup).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Multiple high-frequency backup policies are not supported.</li>
         * <li>Multiple geo-redundancy backups are not supported, and geo-redundancy policies only support dayOfWeek.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dayOfWeek</p>
         */
        @NameInMap("BackupPolicy")
        public String backupPolicy;

        /**
         * <p>The destination region of the backup policy.</p>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type of the backup policy. Valid values:</p>
         * <ul>
         * <li>level1: same-region backup.</li>
         * <li>level2Cross: cross-region backup.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>level1</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>The ID of the backup policy.</p>
         * <blockquote>
         * <p>Notice: Required when ActionType is not CREATE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The backup cycle. Valid values:</p>
         * <ul>
         * <li>When BackupPolicy is set to dayOfWeek: 1, 2, 3, 4, 5, 6, and 7 represent Monday to Sunday. At least two backups must be performed per week.</li>
         * <li>When BackupPolicy is set to dayOfMonth: 1, 3, and -1 represent the 1st, 3rd, and last day of each month. -1 represents the last day of the month.</li>
         * <li>When BackupPolicy is set to dayOfYear: 01-07 represents January 7. Only one day can be selected.</li>
         * <li>When BackupPolicy is set to backupInterval: specify one of the following numbers in minutes. For sharded clusters, the valid values are 30, 60, 120, 180, 240, 360, 480, and 720. For replica sets, the valid values are 15, 30, 60, 120, 180, 240, 360, 480, and 720.</li>
         * </ul>
         * <p>Note:</p>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.
         * Geo-redundancy policies only support dayOfWeek.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1,4,6</p>
         */
        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        /**
         * <p>Specifies whether to enable hourly sparse backup. Valid values:</p>
         * <ul>
         * <li>true: When the backup frequency is in minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after the hour is retained.</li>
         * <li>false: All snapshots within the retention period of high-frequency backups are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PreserveOneEachHour")
        public Boolean preserveOneEachHour;

        /**
         * <p>The retention period of the backup plan in days. Valid values:</p>
         * <ul>
         * <li>Same-region backup: 7 to 7300 days.</li>
         * <li>Geo-redundancy: 3 to 1825 days.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Required when RetentionType is set to delay.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionPeriod")
        public Integer retentionPeriod;

        /**
         * <p>The retention cycle type of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: long-term retention (LTR).</li>
         * <li><strong>delay</strong>: retention for a fixed number of days.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The region where the instance resides.</p>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type of the backup policy. Valid values:</p>
         * <ul>
         * <li>db: same-region backup.</li>
         * <li>level1: cross-region backup.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Required when ActionType is not DELETE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        public static ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies self = new ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setPreserveOneEachHour(Boolean preserveOneEachHour) {
            this.preserveOneEachHour = preserveOneEachHour;
            return this;
        }
        public Boolean getPreserveOneEachHour() {
            return this.preserveOneEachHour;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

    public static class ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies extends TeaModel {
        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>CREATE: Creates a policy.</li>
         * <li>UPDATE: Updates a policy.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: This parameter takes effect only for geo-redundancy. To delete geo-redundancy, set EnableLogBackup to 0 and set ActionType to UPDATE.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The region where the geo-redundancy log backup is stored.</p>
         * <blockquote>
         * <p>Required for geo-redundancy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type of the log backup policy. Valid values:</p>
         * <ul>
         * <li>level1: same-region backup. </li>
         * <li>level2Cross: cross-region backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level1</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>Specifies whether to enable log backup. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Log backup must be enabled for sharded instances.</li>
         * <li>You must enable same-region log backup before you can enable cross-region log backup.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        /**
         * <p>The ID of the log backup policy. This parameter is required only for cross-region log backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The retention period of the log backup in days. This parameter takes effect when RetentionType is set to delay. Valid values:</p>
         * <ul>
         * <li>Same-region backup: 7 to 7300 days. </li>
         * <li>Geo-redundancy: 3 to 1825 days. The value must be less than the backup retention period of the geo-redundancy policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionPeriod")
        public Integer retentionPeriod;

        /**
         * <p>The retention cycle type of the log backup. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: long-term retention (LTR).</li>
         * <li><strong>delay</strong>: retention for a fixed number of days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The region where the source instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type of the log backup policy. Valid values:</p>
         * <ul>
         * <li>db: same-region backup.</li>
         * <li>level1: cross-region backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        public static ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies self = new ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyAdvancedBackupPolicyRequestAdvancedBackupLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
