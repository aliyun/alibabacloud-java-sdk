// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The frequency at which high-frequency backup is created. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: High-frequency backup is disabled.</li>
     * <li><strong>15</strong>: every 15 minutes.</li>
     * <li><strong>30</strong>: every 30 minutes.</li>
     * <li><strong>60</strong>: every hour.</li>
     * <li><strong>120</strong>: every 2 hours.</li>
     * <li><strong>180</strong>: every 3 hours.</li>
     * <li><strong>240</strong>: every 4 hours.</li>
     * <li><strong>360</strong>: every 6 hours.</li>
     * <li><strong>480</strong>: every 8 hours.</li>
     * <li><strong>720</strong>: every 12 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public Integer backupInterval;

    /**
     * <p>The retention period of the backup data. Unit: day.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>The backup retention policy configured for the instance. Valid values:</p>
     * <ol>
     * <li>0: All backup sets are immediately deleted when the instance is released.</li>
     * <li>1: Automatic backup is performed and the backup set is retained for a long period of time when the instance is released.</li>
     * <li>2: Automatic backup is performed and all backup sets are retained for a long period of time when the instance is released.</li>
     * </ol>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Retain the backup files of an ApsaraDB for MongoDB instance for a long period of time</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The retention period of Cross-regional backup.
     * Valid values:</p>
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
     * <p>Monday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The retention type of Cross-regional  log backup.</p>
     * <ul>
     * <li>delay : retain the backup for a period of time.</li>
     * <li>never : retain the backup permanently.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The retention time of Cross-regional log backup.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The retention type of Cross-regional backup.</p>
     * <ul>
     * <li>delay : retain the backup for a period of time.</li>
     * <li>never : retain the backup permanently.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

    /**
     * <p>The retention time of Cross-regional backup.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossRetentionValue")
    public Integer crossRetentionValue;

    /**
     * <p>The region ID of the cross-regional backup..</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): The log backup feature is disabled.</li>
     * <li><strong>1</strong>: The log backup feature is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>Whether to turn on cross-regional log backup.</p>
     * <ul>
     * <li>1: turn on . Used for sharded cluster.</li>
     * <li>0: turn off. Used for replicate set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The retention period of high-frequency backups. Unit: day.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public String highFrequencyBackupRetention;

    /**
     * <p>The number of days for which log backups are retained. Valid values: 7 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The day of a week on which to back up data. Valid values:</p>
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
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time range during which the backup was created. The time follows the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time of next standard backup.</p>
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
     * <p>5A9464CA-F7DC-5434-90B1-DF7F197C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: single-digit second backup</li>
     * <li><strong>Standard</strong> (default): standard backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

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

    public DescribeBackupPolicyResponseBody setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public DescribeBackupPolicyResponseBody setCrossBackupPeriod(String crossBackupPeriod) {
        this.crossBackupPeriod = crossBackupPeriod;
        return this;
    }
    public String getCrossBackupPeriod() {
        return this.crossBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setCrossLogRetentionType(String crossLogRetentionType) {
        this.crossLogRetentionType = crossLogRetentionType;
        return this;
    }
    public String getCrossLogRetentionType() {
        return this.crossLogRetentionType;
    }

    public DescribeBackupPolicyResponseBody setCrossLogRetentionValue(Integer crossLogRetentionValue) {
        this.crossLogRetentionValue = crossLogRetentionValue;
        return this;
    }
    public Integer getCrossLogRetentionValue() {
        return this.crossLogRetentionValue;
    }

    public DescribeBackupPolicyResponseBody setCrossRetentionType(String crossRetentionType) {
        this.crossRetentionType = crossRetentionType;
        return this;
    }
    public String getCrossRetentionType() {
        return this.crossRetentionType;
    }

    public DescribeBackupPolicyResponseBody setCrossRetentionValue(Integer crossRetentionValue) {
        this.crossRetentionValue = crossRetentionValue;
        return this;
    }
    public Integer getCrossRetentionValue() {
        return this.crossRetentionValue;
    }

    public DescribeBackupPolicyResponseBody setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(Integer enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponseBody setEnableCrossLogBackup(Integer enableCrossLogBackup) {
        this.enableCrossLogBackup = enableCrossLogBackup;
        return this;
    }
    public Integer getEnableCrossLogBackup() {
        return this.enableCrossLogBackup;
    }

    public DescribeBackupPolicyResponseBody setHighFrequencyBackupRetention(String highFrequencyBackupRetention) {
        this.highFrequencyBackupRetention = highFrequencyBackupRetention;
        return this;
    }
    public String getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
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

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
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

    public DescribeBackupPolicyResponseBody setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

}
