// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The high-frequency backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: high-frequency backup is disabled</li>
     * <li><strong>15</strong>: every 15 minutes</li>
     * <li><strong>30</strong>: every 30 minutes</li>
     * <li><strong>60</strong>: every 1 hour</li>
     * <li><strong>120</strong>: every 2 hours</li>
     * <li><strong>180</strong>: every 3 hours</li>
     * <li><strong>240</strong>: every 4 hours</li>
     * <li><strong>360</strong>: every 6 hours</li>
     * <li><strong>480</strong>: every 8 hours</li>
     * <li><strong>720</strong>: every 12 hours</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public Integer backupInterval;

    /**
     * <p>The backup retention period in days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>The backup data retention policy. Valid values:</p>
     * <ul>
     * <li>0: All backup sets of the instance are immediately deleted when the instance is released.</li>
     * <li>1: An automatic backup is created when the instance is released, and the backup set is retained for long-term retention (LTR).</li>
     * <li>2: An automatic backup is created when the instance is released, and all backup sets of the cluster are retained for long-term retention (LTR).</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term retention backup</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The days of the week when geo-redundancy backups are performed. Valid values:</p>
     * <ul>
     * <li>Monday: Monday</li>
     * <li>Tuesday: Tuesday</li>
     * <li>Wednesday: Wednesday</li>
     * <li>Thursday: Thursday</li>
     * <li>Friday: Friday</li>
     * <li>Saturday: Saturday</li>
     * <li>Sunday: Sunday</li>
     * </ul>
     * <blockquote>
     * <p>Required for geo-redundancy backups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The retention type for cross-region log backups. Valid values:</p>
     * <ul>
     * <li>delay: retained for a specified period</li>
     * <li>never: never expires</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The retention period for cross-region log backups.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The retention type for geo-redundancy backups. Valid values:</p>
     * <ul>
     * <li><p>delay: retained for a specified period</p>
     * </li>
     * <li><p>never: never expires</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

    /**
     * <p>The retention period for geo-redundancy backups.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossRetentionValue")
    public Integer crossRetentionValue;

    /**
     * <p>The region where geo-redundancy backups are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Specifies whether to enable log backup. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled (default)</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>Specifies whether cross-region log backup is enabled.</p>
     * <blockquote>
     * <p>Required for geo-redundancy backups.</p>
     * <ul>
     * <li>1: enabled (must be set to 1 for sharded cluster instances)</li>
     * <li>0: disabled (must be set to 0 for replica set instances)</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The retention period for high-frequency backups, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public String highFrequencyBackupRetention;

    /**
     * <p>The retention period for log backups, in days. Valid values: 7 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong>: Monday</li>
     * <li><strong>Tuesday</strong>: Tuesday</li>
     * <li><strong>Wednesday</strong>: Wednesday</li>
     * <li><strong>Thursday</strong>: Thursday</li>
     * <li><strong>Friday</strong>: Friday</li>
     * <li><strong>Saturday</strong>: Saturday</li>
     * <li><strong>Sunday</strong>: Sunday</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The backup time. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time of the next regular backup. The format is <i>yyyy-mm-dd</i>t<i>hh:mm</i>z (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-19T19:11Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>Specifies whether to enable sparse backup within an hour. Valid values:</p>
     * <ul>
     * <li><p>true: When the backup frequency is set to minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after the hour is retained.</p>
     * </li>
     * <li><p>false: Sparse backup within an hour is disabled. All snapshots within the high-frequency backup retention period are retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PreserveOneEachHour")
    public Boolean preserveOneEachHour;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5A9464CA-F7DC-5434-90B1-DF7F197C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: backup within seconds</li>
     * <li><strong>Standard</strong>: standard backup (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    /**
     * <p>The region where the source instance is deployed.</p>
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

    public DescribeBackupPolicyResponseBody setPreserveOneEachHour(Boolean preserveOneEachHour) {
        this.preserveOneEachHour = preserveOneEachHour;
        return this;
    }
    public Boolean getPreserveOneEachHour() {
        return this.preserveOneEachHour;
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
