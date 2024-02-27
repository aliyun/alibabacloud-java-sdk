// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The frequency at which high-frequency backups are created. Valid values:</p>
     * <br>
     * <p>*   **-1**: disables high-frequency backup.</p>
     * <p>*   **15**: every 15 minutes.</p>
     * <p>*   **30**: every 30 minutes.</p>
     * <p>*   **60**: every hour.</p>
     * <p>*   **120**: every 2 hours.</p>
     * <p>*   **180**: every 3 hours.</p>
     * <p>*   **240**: every 4 hours.</p>
     * <p>*   **360**: every 6 hours.</p>
     * <p>*   **480**: every 8 hours.</p>
     * <p>*   **720**: every 12 hours.</p>
     * <br>
     * <p>> * If **SnapshotBackupType** is set to **Standard**, this parameter is set to **-1** and cannot be changed.</p>
     * <p>> * High-frequency backup takes effect only when **SnapshotBackupType** is set to **Flash** and the value of this parameter is greater than 0.</p>
     */
    @NameInMap("BackupInterval")
    public String backupInterval;

    /**
     * <p>The retention period of full backups.</p>
     * <br>
     * <p>> * If your instance is created before September 10, 2021, backups are retained for seven days by default.</p>
     * <p>> * If your instance is created after September 10, 2021, backups are retained for 30 days by default.</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable log backup. Default value: 0. Valid values:</p>
     * <br>
     * <p>*   **0**: disables log backup.</p>
     * <p>*   **1**: enables log backup.</p>
     */
    @NameInMap("EnableBackupLog")
    public Long enableBackupLog;

    @NameInMap("HighFrequencyBackupRetention")
    public Long highFrequencyBackupRetention;

    /**
     * <p>The number of days for which log backups are retained. Default value: 7.</p>
     * <br>
     * <p>Valid values: 7 to 730.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Long logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The day of a week on which to back up data. Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     * <br>
     * <p>>  Separate multiple values with commas (,).</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time range to back up data. Specify the time in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  The time range is 1 hour.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The snapshot backup type. Default value: Standard. Valid values:</p>
     * <br>
     * <p>*   **Flash**: single-digit second backup</p>
     * <p>*   **Standard**: standard backup</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

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

    public ModifyBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupPolicyRequest setEnableBackupLog(Long enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Long getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyRequest setHighFrequencyBackupRetention(Long highFrequencyBackupRetention) {
        this.highFrequencyBackupRetention = highFrequencyBackupRetention;
        return this;
    }
    public Long getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
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

}
