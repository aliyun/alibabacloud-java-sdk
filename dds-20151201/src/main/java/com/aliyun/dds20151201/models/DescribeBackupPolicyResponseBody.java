// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    // The frequency at which high-frequency backups are created. Valid values:
    // 
    // *   **-1**: disables high-frequency backup.
    // *   **15**: every 15 minutes.
    // *   **30**: every 30 minutes.
    // *   **60**: every hour.
    // *   **120**: every 2 hours.
    // *   **180**: every 3 hours.
    // *   **240**: every 4 hours.
    // *   **360**: every 6 hours.
    // *   **480**: every 8 hours.
    // *   **720**: every 12 hours.
    @NameInMap("BackupInterval")
    public Integer backupInterval;

    // The retention period of backups. Unit: days.
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    // Indicates whether log backup is enabled. Default value: 0. Valid values:
    // 
    // *   **0**: disables log backup.
    // *   **1**: enables log backup.
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    // The number of days for which to retain log backups. Valid values: 7 to 730.
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    // The day of a week on which to back up data. Valid values:
    // 
    // *   **Monday**
    // *   **Tuesday**
    // *   **Wednesday**
    // *   **Thursday**
    // *   **Friday**
    // *   **Saturday**
    // *   **Sunday**
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    // The time range to back up data. The time is in the *HH:mm*Z-*HH:mm*Z format. The time is displayed in UTC.
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The snapshot backup type. Default value: Standard. Valid values:
    // 
    // *   **Flash**: single-digit second backup
    // *   **Standard**: standard backup
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupInterval(Integer backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public Integer getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(Integer enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
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

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

}
