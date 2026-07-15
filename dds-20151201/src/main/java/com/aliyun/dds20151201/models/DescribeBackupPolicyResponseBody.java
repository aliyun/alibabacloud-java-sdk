// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The high-frequency backup frequency. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: high-frequency backup is disabled.</p>
     * </li>
     * <li><p><strong>15</strong>: every 15 minutes.</p>
     * </li>
     * <li><p><strong>30</strong>: every 30 minutes.</p>
     * </li>
     * <li><p><strong>60</strong>: every 1 hour.</p>
     * </li>
     * <li><p><strong>120</strong>: every 2 hours.</p>
     * </li>
     * <li><p><strong>180</strong>: every 3 hours.</p>
     * </li>
     * <li><p><strong>240</strong>: every 4 hours.</p>
     * </li>
     * <li><p><strong>360</strong>: every 6 hours.</p>
     * </li>
     * <li><p><strong>480</strong>: every 8 hours.</p>
     * </li>
     * <li><p><strong>720</strong>: every 12 hours.</p>
     * </li>
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
     * <p>The backup retention policy.</p>
     * <ol>
     * <li><p>0: All backup sets of the instance are immediately deleted when the instance is released</p>
     * </li>
     * <li><p>1: The instance is automatically backed up when it is released, and the backup set is retained for a long time</p>
     * </li>
     * <li><p>2: The instance is automatically backed up when it is released, and all backup sets of the cluster are retained for a long time</p>
     * </li>
     * </ol>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term backup retention</a></p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The geo-redundancy backup retention time.</p>
     * <ol>
     * <li><p>Monday: Monday.</p>
     * </li>
     * <li><p>Tuesday: Tuesday.</p>
     * </li>
     * <li><p>Wednesday: Wednesday.</p>
     * </li>
     * <li><p>Thursday: Thursday.</p>
     * </li>
     * <li><p>Friday: Friday.</p>
     * </li>
     * <li><p>Saturday: Saturday.</p>
     * </li>
     * <li><p>Sunday: Sunday.</p>
     * </li>
     * </ol>
     * <blockquote>
     * <p>Required for geo-redundancy backup</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The geo-redundancy log backup retention type.</p>
     * <ul>
     * <li><p>delay: retained for a period of time</p>
     * </li>
     * <li><p>never: never expires</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The geo-redundancy log backup retention period.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The geo-redundancy backup retention type.</p>
     * <ul>
     * <li><p>delay: retained for a period of time</p>
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
     * <p>The geo-redundancy backup retention period.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossRetentionValue")
    public Integer crossRetentionValue;

    /**
     * <p>The region where the geo-redundancy backup is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Indicates whether log backup is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: disabled (default).</p>
     * </li>
     * <li><p><strong>1</strong>: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>Indicates whether cross-region log backup is enabled.</p>
     * <blockquote>
     * <p>Required for geo-redundancy backup</p>
     * <ul>
     * <li><p>1: enabled (must be 1 for sharded cluster instances)</p>
     * </li>
     * <li><p>0: disabled (must be 0 for replica set instances)</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The high-frequency backup retention period in days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public String highFrequencyBackupRetention;

    /**
     * <p>The log backup retention period in days. Valid values: 7 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong>: Monday.</p>
     * </li>
     * <li><p><strong>Tuesday</strong>: Tuesday.</p>
     * </li>
     * <li><p><strong>Wednesday</strong>: Wednesday.</p>
     * </li>
     * <li><p><strong>Thursday</strong>: Thursday.</p>
     * </li>
     * <li><p><strong>Friday</strong>: Friday.</p>
     * </li>
     * <li><p><strong>Saturday</strong>: Saturday.</p>
     * </li>
     * <li><p><strong>Sunday</strong>: Sunday.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The backup time in the format of <em>HH:mm</em>Z-<em>HH:mm</em>Z (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The next regular backup time in the format of <em>yyyy-mm-dd</em>t<em>hh:mm</em>z (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-19T19:11Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>Indicates whether sparse backup within an hour is enabled.</p>
     * <ul>
     * <li><p>true: When the backup frequency is at the minute level, all snapshots within 1 hour from the current time are retained. For snapshots that are more than 1 hour but within 24 hours from the current time, only the first snapshot after each hour is retained.</p>
     * </li>
     * <li><p>false: Sparse backup within an hour is disabled: all snapshots within the high-frequency backup retention period are retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PreserveOneEachHour")
    public Boolean preserveOneEachHour;

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
     * <li><p><strong>Flash</strong>: second-level backup.</p>
     * </li>
     * <li><p><strong>Standard</strong>: regular backup (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    /**
     * <p>The region where the source instance is located.</p>
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
