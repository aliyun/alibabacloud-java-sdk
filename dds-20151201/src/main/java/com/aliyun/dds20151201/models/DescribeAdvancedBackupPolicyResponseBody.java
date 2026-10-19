// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The list of backup policies.</p>
     */
    @NameInMap("AdvancedBackupDataPolicies")
    public java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies> advancedBackupDataPolicies;

    /**
     * <p>The list of log backup policies.</p>
     */
    @NameInMap("AdvancedBackupLogPolicies")
    public java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies> advancedBackupLogPolicies;

    /**
     * <p>The data retention policy. Valid values:</p>
     * <ul>
     * <li>0: All backup sets of the instance are immediately deleted when the instance is released.</li>
     * <li>1: The last backup set is retained for long-term retention (LTR) when the instance is released.</li>
     * <li>2: All backup sets are retained for long-term retention (LTR) when the instance is released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp14bf67a76d****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The backup time in the <i>HH:mm</i>Z-<i>HH:mm</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time range for starting a backup. The time is in the <code>HH:mmZ-HH:mmZ</code> format (UTC). Example: 01:00Z-02:00Z. The backup starts within this time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-19T19:11Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111E7B16-0A87-4CBA-B271-F34AD61E099F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: backup within seconds</li>
     * <li><strong>Standard</strong>: standard backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    public static DescribeAdvancedBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupPolicyResponseBody self = new DescribeAdvancedBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupPolicyResponseBody setAdvancedBackupDataPolicies(java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies> advancedBackupDataPolicies) {
        this.advancedBackupDataPolicies = advancedBackupDataPolicies;
        return this;
    }
    public java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies> getAdvancedBackupDataPolicies() {
        return this.advancedBackupDataPolicies;
    }

    public DescribeAdvancedBackupPolicyResponseBody setAdvancedBackupLogPolicies(java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies> advancedBackupLogPolicies) {
        this.advancedBackupLogPolicies = advancedBackupLogPolicies;
        return this;
    }
    public java.util.List<DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies> getAdvancedBackupLogPolicies() {
        return this.advancedBackupLogPolicies;
    }

    public DescribeAdvancedBackupPolicyResponseBody setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public DescribeAdvancedBackupPolicyResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAdvancedBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeAdvancedBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeAdvancedBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvancedBackupPolicyResponseBody setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    public static class DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies extends TeaModel {
        /**
         * <p>The action type.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The scheduling type of the advanced policy. Valid values:</p>
         * <ul>
         * <li>dayOfWeek: weekly scheduling</li>
         * <li>dayOfMonth: monthly scheduling</li>
         * <li>dayOfYear: yearly scheduling</li>
         * <li>backupInterval: fixed-interval scheduling (high-frequency backup)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dayOfWeek</p>
         */
        @NameInMap("BackupPolicy")
        public String backupPolicy;

        /**
         * <p>The destination region of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type of the backup policy. Valid values:</p>
         * <ul>
         * <li>level1: same-region backup</li>
         * <li>level2Cross: cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level1</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The backup cycle. </p>
         * <ul>
         * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfWeek</strong>, the values 1, 2, 3, 4, 5, 6, and 7 represent Monday to Sunday.</li>
         * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfMonth</strong>, the values 1, 3, and -1 represent the 1st, 3rd, and last day of each month.</li>
         * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfYear</strong>, the value 01-07 represents January 7.</li>
         * <li>When <strong>BackupPolicy</strong> is set to <strong>backupInterval</strong>, the value 30 represents a backup every 30 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        /**
         * <p>Specifies whether to enable sparse backup within an hour. Valid values:</p>
         * <ul>
         * <li>true: When the backup frequency is minute-level, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after each hour is retained.</li>
         * <li>false: Sparse backup within an hour is disabled. All snapshots within the retention period of high-frequency backups are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PreserveOneEachHour")
        public Boolean preserveOneEachHour;

        /**
         * <p>The number of days for which backups are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionPeriod")
        public Integer retentionPeriod;

        /**
         * <p>The retention epoch type of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: long-term retention (LTR)</li>
         * <li><strong>delay</strong>: fixed-day retention</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The source type of the backup policy. Valid values:</p>
         * <ul>
         * <li>db: same-region backup</li>
         * <li>level1: cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        public static DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies self = new DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setBackupPolicy(String backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setPreserveOneEachHour(Boolean preserveOneEachHour) {
            this.preserveOneEachHour = preserveOneEachHour;
            return this;
        }
        public Boolean getPreserveOneEachHour() {
            return this.preserveOneEachHour;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

    public static class DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies extends TeaModel {
        /**
         * <p>The destination region of the log backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The destination type of the log backup policy. Valid values:</p>
         * <ul>
         * <li>level1: same-region backup</li>
         * <li>level2Cross: cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>Specifies whether log backup is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        /**
         * <p>The ID of the log backup policy. This parameter is returned only for cross-region log backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The number of days for which log backups are retained. This parameter takes effect only when RetentionType is set to delay.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RetentionPeriod")
        public String retentionPeriod;

        /**
         * <p>The retention epoch type of log backups. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: long-term retention (LTR)</li>
         * <li><strong>delay</strong>: fixed-day retention</li>
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
         * <li>db: same-region backup</li>
         * <li>level1: cross-region backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>et</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        public static DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies self = new DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setRetentionPeriod(String retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public String getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeAdvancedBackupPolicyResponseBodyAdvancedBackupLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
