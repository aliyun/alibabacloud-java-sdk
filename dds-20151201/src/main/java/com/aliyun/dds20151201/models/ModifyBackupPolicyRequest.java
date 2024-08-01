// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The frequency at which high-frequency backup is created. Valid values:</p>
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
     * <li><p>If the <strong>SnapshotBackupType</strong> parameter is set to <strong>Standard</strong>, this parameter is set to -1 and cannot be changed.</p>
     * </li>
     * <li><p>High-frequency backup takes effect only when the <strong>SnapshotBackupType</strong> parameter is set to <strong>Flash</strong> and the value of this parameter is greater than 0.</p>
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

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    @NameInMap("CrossBackupPeriod")
    public String crossBackupPeriod;

    @NameInMap("CrossBackupType")
    public String crossBackupType;

    @NameInMap("CrossLogRetentionType")
    public String crossLogRetentionType;

    @NameInMap("CrossLogRetentionValue")
    public Integer crossLogRetentionValue;

    @NameInMap("CrossRetentionType")
    public String crossRetentionType;

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

    @NameInMap("EnableCrossLogBackup")
    public Integer enableCrossLogBackup;

    /**
     * <p>The number of days for which high-frequency backups are retained. Before you use this parameter, make sure that you specify the BackupInterval parameter. By default, high-frequency backups are retained for one day.</p>
     */
    @NameInMap("HighFrequencyBackupRetention")
    public Long highFrequencyBackupRetention;

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
