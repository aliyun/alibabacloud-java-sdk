// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupabaseBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The interval between automatic recovery points, in minutes. A value greater than 0 indicates that automatic recovery points are enabled. If the feature is disabled, -1 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public Integer backupInterval;

    /**
     * <p>The data backup retention period, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>Indicates whether automatic recovery points are enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     */
    @NameInMap("EnableRecoveryPoint")
    public Boolean enableRecoveryPoint;

    /**
     * <p>The data backup cycle. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
     * 
     * <strong>example:</strong>
     * <p>Wednesday,Friday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The data backup time window in UTC. The format is HH:mmZ-HH:mmZ.</p>
     * 
     * <strong>example:</strong>
     * <p>01:00Z-02:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The interval for the automatic creation of recovery points, in hours. Valid values: 1/6 (10 minutes), 1/2 (30 minutes), 1, 2, 4, and 8. This value is valid only when EnableRecoveryPoint is set to true. If automatic recovery points are shutdown, 0 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecoveryPointPeriod")
    public String recoveryPointPeriod;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupabaseBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseBackupPolicyResponseBody self = new DescribeSupabaseBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseBackupPolicyResponseBody setBackupInterval(Integer backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public Integer getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeSupabaseBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeSupabaseBackupPolicyResponseBody setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
        this.enableRecoveryPoint = enableRecoveryPoint;
        return this;
    }
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    public DescribeSupabaseBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeSupabaseBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeSupabaseBackupPolicyResponseBody setRecoveryPointPeriod(String recoveryPointPeriod) {
        this.recoveryPointPeriod = recoveryPointPeriod;
        return this;
    }
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    public DescribeSupabaseBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
