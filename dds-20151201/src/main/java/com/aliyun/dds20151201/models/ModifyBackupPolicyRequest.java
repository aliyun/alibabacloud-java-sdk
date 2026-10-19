// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The high-frequency backup frequency. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: Disables high-frequency backups.</li>
     * <li><strong>30</strong>: Every 30 minutes.</li>
     * <li><strong>60</strong>: Every 1 hour.</li>
     * <li><strong>120</strong>: Every 2 hours.</li>
     * <li><strong>180</strong>: Every 3 hours.</li>
     * <li><strong>240</strong>: Every 4 hours.</li>
     * <li><strong>360</strong>: Every 6 hours.</li>
     * <li><strong>480</strong>: Every 8 hours.</li>
     * <li><strong>720</strong>: Every 12 hours.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If <strong>SnapshotBackupType</strong> is set to <strong>Standard</strong>, this parameter must be set to <strong>-1</strong>.</li>
     * <li>If <strong>SnapshotBackupType</strong> is set to <strong>Flash</strong> and this parameter is set to a value greater than 0, high-frequency backups take effect.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>The number of days for which full backups are retained.</p>
     * <blockquote>
     * <ul>
     * <li>For users who created instances before September 10, 2021, the default retention period is 7 days.</li>
     * <li>For new users who created instances on or after September 10, 2021, the default retention period is 30 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The backup data retention policy. Valid values:</p>
     * <ul>
     * <li><p>0: Deletes all backup sets of the instance immediately when the instance is released.</p>
     * </li>
     * <li><p>1: An automatic backup is performed when the instance is released, and the backup set is retained for long-term retention (LTR).</p>
     * </li>
     * <li><p>2: An automatic backup is performed when the instance is released, and all backup sets of the cluster are retained for long-term retention (LTR).</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term retention backups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The days of the week when cross-region backup is performed. Valid values:</p>
     * <ol>
     * <li>Monday: Monday.</li>
     * <li>Tuesday: Tuesday.</li>
     * <li>Wednesday: Wednesday.</li>
     * <li>Thursday: Thursday.</li>
     * <li>Friday: Friday.</li>
     * <li>Saturday: Saturday.</li>
     * <li>Sunday: Sunday.</li>
     * </ol>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * <ul>
     * <li>If you specify multiple values, separate them with commas (,).</li>
     * <li>When the backup settings are set to standard backup, the value must be a subset of the PreferredBackupPeriod backup epoch.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The operation policy for cross-region backup. Valid values:</p>
     * <ul>
     * <li>update: Modifies the cross-region backup policy.</li>
     * <li>delete: Deletes the cross-region backup policy.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The retention type for cross-region log backup. Valid values:</p>
     * <ul>
     * <li>delay: Retains backups for a specified period.</li>
     * <li>never: Never expires.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The retention period for cross-region log backup. Valid values: 3 to 1825 days. The value must be less than or equal to the value of CrossRetentionValue.</p>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The retention type for cross-region backup. Valid values:</p>
     * <ul>
     * <li><p>delay: Retains backups for a specified period.</p>
     * </li>
     * <li><p>never: Never expires.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

    /**
     * <p>The retention period for cross-region backup. Valid values: 3 to 1825 days.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required for cross-region backup.</li>
     * <li>This parameter is required and must be specified when CrossRetentionType is set to delay.</li>
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
     * <p>The region where backups are stored.</p>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
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
     * <li><p><strong>0</strong>: Disables log backup. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: Enables log backup.</p>
     * <blockquote>
     * <p>Notice: Sharded cluster instances do not support disabling log backup.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EnableBackupLog")
    public Long enableBackupLog;

    /**
     * <p>Specifies whether to enable cross-region log backup.</p>
     * <blockquote>
     * <p>This parameter is required for cross-region backup.</p>
     * <ul>
     * <li>1: Enables cross-region log backup. This value is required for sharded cluster instances. For replica set instances, this value is required if you want to support cross-region point-in-time recovery.</li>
     * <li>0: Disables cross-region log backup.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The number of days for which high-frequency backups are retained. Before you use this parameter, make sure that the BackupInterval parameter is specified. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public Long highFrequencyBackupRetention;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li>replicate </li>
     * <li>sharding</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when the backup recovery type is set to rebuilding a deleted instance.</li>
     * <li>This parameter is required when the backup recovery type is set to cloning an instance from cross-region backup.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>replicate</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of days for which log backups are retained. Default value: 7.</p>
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
     * <li><strong>Monday</strong>: Monday.</li>
     * <li><strong>Tuesday</strong>: Tuesday.</li>
     * <li><strong>Wednesday</strong>: Wednesday.</li>
     * <li><strong>Thursday</strong>: Thursday.</li>
     * <li><strong>Friday</strong>: Friday.</li>
     * <li><strong>Saturday</strong>: Saturday.</li>
     * <li><strong>Sunday</strong>: Sunday.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: To ensure data security, back up your MongoDB data at least twice a week.</notice></p>
     * </blockquote>
     * <blockquote>
     * <p>If you specify multiple values, separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Wednesday,Friday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time period during which backups are performed. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
     * <blockquote>
     * <p>The time period is limited to 1 hour.</p>
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
     * <li><p>true: If the backup frequency is set to minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot taken after the hour is retained.</p>
     * </li>
     * <li><p>false: All snapshots taken within the high-frequency backup retention period are retained.</p>
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
     * <li><strong>Flash</strong>: Backup within seconds.</li>
     * <li><strong>Standard</strong>: Standard backup. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    /**
     * <p>The region where the instance is deployed.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required to recover deleted instances.</li>
     * <li>This parameter is required for cross-region backup.</li>
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
