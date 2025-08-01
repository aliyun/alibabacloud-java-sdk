// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The frequency at which high-frequency backups are generated. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: High-frequency backup is disabled.</li>
     * <li><strong>30</strong>: High-frequency backups are generated every 30 minutes.</li>
     * <li><strong>60</strong>: High-frequency backups are generated every 1 hour.</li>
     * <li><strong>120</strong>: High-frequency backups are generated every 2 hours.</li>
     * <li><strong>180</strong>: High-frequency backups are generated every 3 hours.</li>
     * <li><strong>240</strong>: High-frequency backups are generated every 4 hours.</li>
     * <li><strong>360</strong>: High-frequency backups are generated every 6 hours.</li>
     * <li><strong>480</strong>: High-frequency backups are generated every 8 hours.</li>
     * <li><strong>720</strong>: High-frequency backups are generated every 12 hours.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set the <strong>SnapshotBackupType</strong> parameter to <strong>Standard</strong>, you must fix the value of this parameter to -1.</p>
     * </li>
     * <li><p>High-frequency backup takes effect only when you set the <strong>SnapshotBackupType</strong> parameter to <strong>Flash</strong> and this parameter to a value greater than 0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>The retention period of full backups.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If your instance is created before September 10, 2021, backups are retained for seven days by default.</p>
     * </li>
     * <li><p>If your instance is created after September 10, 2021, backups are retained for 30 days by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The backup retention policy configured for the instance. Valid values:</p>
     * <ul>
     * <li>0: All backup sets are immediately deleted when the instance is released.</li>
     * <li>1: Automatic backup is performed when the instance is released and the backup set is retained for a long period of time.</li>
     * <li>2: Automatic backup is performed when the instance is released and all backup sets are retained for a long period of time.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Retain the backup files of an ApsaraDB for MongoDB instance for a long period of time</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The day of the week on which the cross-region backup files are retained. Valid values:</p>
     * <ol>
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday</li>
     * </ol>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * <ul>
     * <li><p>Separate multiple values with commas (,).</p>
     * </li>
     * <li><p>If you set the SnapshotBackupType parameter to Standard, the parameter value must fall within the value of the PreferredBackupPeriod parameter that specifies the standard backup period.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    /**
     * <p>The action performed for the cross-region backup policy. Valid values:</p>
     * <ul>
     * <li>update: modifies the cross-region backup policy.</li>
     * <li>delete: deletes the cross-region backup policy.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The retention type of the cross-region log backup files. Valid values:</p>
     * <ul>
     * <li>delay: retains the cross-region backup files for a period of time.</li>
     * <li>never: permanently retains the cross-region backup files.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    /**
     * <p>The retention period of the cross-region log backup files. Valid values: 3 to 1825. Unit: day. The parameter value must be less than or equal to the value of the CrossRetentionValue parameter.</p>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    /**
     * <p>The retention type of the cross-region backup files. Valid values:</p>
     * <ul>
     * <li>delay: retains the cross-region backup files for a period of time.</li>
     * <li>never: permanently retains the cross-region backup files.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
     */
    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

    /**
     * <p>The retention period of the cross-region backup files. Valid values: 3 to 1825. Unit: day.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required for a cross-region backup operation.</p>
     * </li>
     * <li><p>This parameter is required when you set the CrossRetentionType parameter to delay.</p>
     * </li>
     * </ul>
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
     * <p>The region in which the backup files are retained.</p>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Specifies whether to enable the log backup feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): The log backup feature is disabled.</li>
     * <li><strong>1</strong>: The log backup feature is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EnableBackupLog")
    public Long enableBackupLog;

    /**
     * <p>Specifies whether to enable the cross-region log backup feature.</p>
     * <blockquote>
     * <p> This parameter is required for a cross-region backup operation.</p>
     * </blockquote>
     * <ul>
     * <li><p>Valid values:1: enables the feature. The parameter value must be 1 for sharded cluster instances.</p>
     * </li>
     * <li><p>0: disables the feature. The parameter value must be 0 for replica set instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The number of days for which high-frequency backup files are retained. Before you use this parameter, make sure that you specify the BackupInterval parameter. By default, high-frequency backup files are retained for one day.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public Long highFrequencyBackupRetention;

    /**
     * <p>The instance architecture. Valid values:</p>
     * <ul>
     * <li>replicate</li>
     * <li>sharding</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when you set the RestoreType parameter to 2.</p>
     * </li>
     * <li><p>This parameter is required when you set the RestoreType parameter to 3.</p>
     * </li>
     * </ul>
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
     * <p>The day of a week when the system regularly backs up data. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * <p>**</p>
     * <p><strong>Notice</strong>: To ensure data security, make sure that the system backs up data at least twice a week.</p>
     * <blockquote>
     * <p> Separate multiple values with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday,Wednesday,Friday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The start time of the backup. Specify the time in the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The time range is 1 hour.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>03:00Z-04:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("PreserveOneEachHour")
    public Boolean preserveOneEachHour;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required for the data restoration of a deleted instance.</p>
     * </li>
     * <li><p>This parameter is required for a cross-region backup operation.</p>
     * </li>
     * </ul>
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
