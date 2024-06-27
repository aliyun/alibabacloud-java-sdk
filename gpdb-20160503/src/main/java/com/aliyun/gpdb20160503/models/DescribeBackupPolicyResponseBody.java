// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of days for which data backup files are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>Indicates whether automatic point-in-time backup is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic point-in-time backup is enabled.</li>
     * <li><strong>false</strong>: Automatic point-in-time backup is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRecoveryPoint")
    public Boolean enableRecoveryPoint;

    /**
     * <p>The cycle based on which backups are performed. If more than one day of the week is specified, the days of the week are separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Wednesday,Friday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The backup time. The time is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>12:00Z-13:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The frequency of the point-in-time backup. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: per hour</li>
     * <li><strong>2</strong>: per 2 hours</li>
     * <li><strong>4</strong>: per 4 hours</li>
     * <li><strong>8</strong>: per 8 hours</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecoveryPointPeriod")
    public String recoveryPointPeriod;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9E6B3287-A3E2-5A87-B8D8-E9**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
        this.enableRecoveryPoint = enableRecoveryPoint;
        return this;
    }
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setRecoveryPointPeriod(String recoveryPointPeriod) {
        this.recoveryPointPeriod = recoveryPointPeriod;
        return this;
    }
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
