// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
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
    // 
    // > * If **SnapshotBackupType** is set to **Standard**, this parameter is set to **-1** and cannot be changed.
    // > * High-frequency backup takes effect only when **SnapshotBackupType** is set to **Flash** and the value of this parameter is greater than 0.
    @NameInMap("BackupInterval")
    public String backupInterval;

    // The retention period of full backups.
    // 
    // > * If your instance is created before September 10, 2021, backups are retained for seven days by default.
    // > * If your instance is created after September 10, 2021, backups are retained for 30 days by default.
    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    // The ID of the instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // Specifies whether to enable log backup. Default value: 0. Valid values:
    // 
    // *   **0**: disables log backup.
    // *   **1**: enables log backup.
    @NameInMap("EnableBackupLog")
    public Long enableBackupLog;

    // The number of days for which log backups are retained. Default value: 7.
    // 
    // Valid values: 7 to 730.
    @NameInMap("LogBackupRetentionPeriod")
    public Long logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The day of a week on which to back up data. Valid values:
    // 
    // *   **Monday**
    // *   **Tuesday**
    // *   **Wednesday**
    // *   **Thursday**
    // *   **Friday**
    // *   **Saturday**
    // *   **Sunday**
    // 
    // >  Separate multiple values with commas (,).
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    // The time range to back up data. Specify the time in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.
    // 
    // >  The time range is 1 hour.
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The snapshot backup type. Default value: Standard. Valid values:
    // 
    // *   **Flash**: single-digit second backup
    // *   **Standard**: standard backup
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

    public ModifyBackupPolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyBackupPolicyRequest setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

}
