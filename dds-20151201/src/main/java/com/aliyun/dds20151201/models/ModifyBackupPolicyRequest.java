// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The frequency of high-frequency backups. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: High-frequency backup is disabled.</p>
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
     * <blockquote>
     * <ul>
     * <li><p>If you set <strong>SnapshotBackupType</strong> to <strong>Standard</strong>, the value of this parameter is -1.</p>
     * </li>
     * <li><p>High-frequency backup takes effect only if you set <strong>SnapshotBackupType</strong> to <strong>Flash</strong> and set this parameter to a value greater than 0.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>The number of days to retain full backups.</p>
     * <blockquote>
     * <ul>
     * <li><p>For instances that were created before September 10, 2021, the default retention period is 7 days.</p>
     * </li>
     * <li><p>For instances that are created after September 10, 2021, the default retention period is 30 days.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The policy to retain backups when you release the instance.</p>
     * <ul>
     * <li><p>0: All backup sets of the instance are deleted when the instance is released.</p>
     * </li>
     * <li><p>1: An automatic backup is performed when the instance is released, and this backup is retained for a long time.</p>
     * </li>
     * <li><p>2: An automatic backup is performed when the instance is released, and all backup sets of the instance are retained for a long time.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term backup retention</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The days of the week to perform geo-redundant backups. Valid values:</p>
     * <ol>
     * <li><p>Monday</p>
     * </li>
     * <li><p>Tuesday</p>
     * </li>
     * <li><p>Wednesday</p>
     * </li>
     * <li><p>Thursday</p>
     * </li>
     * <li><p>Friday</p>
     * </li>
     * <li><p>Saturday</p>
     * </li>
     * <li><p>Sunday</p>
     * </li>
     * </ol>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * <ul>
     * <li><p>To specify multiple days, separate them with commas (,).</p>
     * </li>
     * <li><p>If you set the backup method to conventional backup, the days of the week specified by this parameter must be a subset of the days of the week specified by PreferredBackupPeriod.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The policy for geo-redundant backups. Valid values:</p>
     * <ul>
     * <li><p>update: Modify the geo-redundancy policy.</p>
     * </li>
     * <li><p>delete: Delete the geo-redundancy policy.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The retention policy for cross-region log backups. Valid values:</p>
     * <ul>
     * <li><p>delay: Retain the backup for a specified period.</p>
     * </li>
     * <li><p>never: Retain the backup permanently.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The number of days to retain cross-region log backups. Valid values: 3 to 1825. The value must be less than or equal to the value of CrossRetentionValue.</p>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The retention policy for geo-redundant backups. Valid values:</p>
     * <ul>
     * <li><p>delay: Retain the backup for a specified period.</p>
     * </li>
     * <li><p>never: Retain the backup permanently.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

    /**
     * <p>The number of days to retain geo-redundant backups. Valid values: 3 to 1825.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required if you enable geo-redundancy.</p>
     * </li>
     * <li><p>This parameter is required if you set CrossRetentionType to delay.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CrossRetentionValue")
    public Integer crossRetentionValue;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp16cb162771****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region ID of the geo-redundant backup.</p>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Specifies whether to enable log backup. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disable log backup. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: Enable log backup.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>You cannot disable log backup for sharded cluster instances.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EnableBackupLog")
    public Long enableBackupLog;

    /**
     * <p>Specifies whether to enable cross-region log backup. Valid values:</p>
     * <blockquote>
     * <p>This parameter is required if you enable geo-redundancy.</p>
     * <ul>
     * <li><p>1: Enable cross-region log backup. This value is required for sharded cluster instances. This value is also required for replica set instances if you want to enable geo-redundant point-in-time recovery.</p>
     * </li>
     * <li><p>0: Disable cross-region log backup.</p>
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
     * <p>The number of days to retain high-frequency backups. Before you specify this parameter, you must set the BackupInterval parameter. The default retention period is 1 day.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public Long highFrequencyBackupRetention;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p>replicate</p>
     * </li>
     * <li><p>sharding</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required when you restore a deleted instance.</p>
     * </li>
     * <li><p>This parameter is required when you clone an instance from a geo-redundant backup.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>replicate</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of days to retain log backups. Default value: 7.</p>
     * <p>Valid values: 7 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Long logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong></p>
     * </li>
     * <li><p><strong>Tuesday</strong></p>
     * </li>
     * <li><p><strong>Wednesday</strong></p>
     * </li>
     * <li><p><strong>Thursday</strong></p>
     * </li>
     * <li><p><strong>Friday</strong></p>
     * </li>
     * <li><p><strong>Saturday</strong></p>
     * </li>
     * <li><p><strong>Sunday</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>To ensure data security, back up the MongoDB instance at least twice a week.</p>
     * <blockquote>
     * <p>To specify multiple backup cycles, separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Wednesday,Friday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time range to perform a backup. Specify the time in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
     * <blockquote>
     * <p>The time range must be 1 hour.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>03:00Z-04:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>Specifies whether to enable hourly sparse backup. Valid values:</p>
     * <ul>
     * <li><p>true: If the backup frequency is in minutes, all snapshots that are generated within the last hour are retained. For snapshots that were generated more than 1 hour ago but less than 24 hours ago, only the first snapshot that is generated after each full hour is retained.</p>
     * </li>
     * <li><p>false: All snapshots are retained within the high-frequency backup retention period.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PreserveOneEachHour")
    public Boolean preserveOneEachHour;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><p><strong>Flash</strong>: second-level backup.</p>
     * </li>
     * <li><p><strong>Standard</strong>: conventional backup. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required if you restore a deleted instance.</p>
     * </li>
     * <li><p>This parameter is required if you enable geo-redundancy.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPeriod(Long backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyBackupPolicyRequest setCrossBackupPeriod(String crossBackupPeriod) {
        this.crossBackupPeriod = crossBackupPeriod;
        return this;
    }
    public String getCrossBackupPeriod() {
        return this.crossBackupPeriod;
    }

    public ModifyBackupPolicyRequest setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public ModifyBackupPolicyRequest setCrossLogRetentionType(String crossLogRetentionType) {
        this.crossLogRetentionType = crossLogRetentionType;
        return this;
    }
    public String getCrossLogRetentionType() {
        return this.crossLogRetentionType;
    }

    public ModifyBackupPolicyRequest setCrossLogRetentionValue(Integer crossLogRetentionValue) {
        this.crossLogRetentionValue = crossLogRetentionValue;
        return this;
    }
    public Integer getCrossLogRetentionValue() {
        return this.crossLogRetentionValue;
    }

    public ModifyBackupPolicyRequest setCrossRetentionType(String crossRetentionType) {
        this.crossRetentionType = crossRetentionType;
        return this;
    }
    public String getCrossRetentionType() {
        return this.crossRetentionType;
    }

    public ModifyBackupPolicyRequest setCrossRetentionValue(Integer crossRetentionValue) {
        this.crossRetentionValue = crossRetentionValue;
        return this;
    }
    public Integer getCrossRetentionValue() {
        return this.crossRetentionValue;
    }

    public ModifyBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupPolicyRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public ModifyBackupPolicyRequest setEnableBackupLog(Long enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Long getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyRequest setEnableCrossLogBackup(Integer enableCrossLogBackup) {
        this.enableCrossLogBackup = enableCrossLogBackup;
        return this;
    }
    public Integer getEnableCrossLogBackup() {
        return this.enableCrossLogBackup;
    }

    public ModifyBackupPolicyRequest setHighFrequencyBackupRetention(Long highFrequencyBackupRetention) {
        this.highFrequencyBackupRetention = highFrequencyBackupRetention;
        return this;
    }
    public Long getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
    }

    public ModifyBackupPolicyRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyBackupPolicyRequest setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Long getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyRequest setPreserveOneEachHour(Boolean preserveOneEachHour) {
        this.preserveOneEachHour = preserveOneEachHour;
        return this;
    }
    public Boolean getPreserveOneEachHour() {
        return this.preserveOneEachHour;
    }

    public ModifyBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyBackupPolicyRequest setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    public ModifyBackupPolicyRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

}
