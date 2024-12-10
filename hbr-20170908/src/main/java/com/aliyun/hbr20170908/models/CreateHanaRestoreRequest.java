// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaRestoreRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>1645628400235</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The backup prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE_DATA_BACKUP_2022_05_02_15_39</p>
     */
    @NameInMap("BackupPrefix")
    public String backupPrefix;

    /**
     * <p>Specifies whether to validate the differential backup and log backup. Valid values: true and false. If you set the value to true, HBR checks whether the required differential backup and log backup are available before the restore job starts. If the differential backup or log backup is unavailable, HBR does not start the restore job.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckAccess")
    public Boolean checkAccess;

    /**
     * <p>Specifies whether to delete all log entries from the log area after the log entries are restored. Valid values: true and false. If you set the value to false, all log entries are deleted from the log area after the log entries are restored.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClearLog")
    public Boolean clearLog;

    /**
     * <p>The ID of the SAP HANA instance that you want to restore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000fbrs5******ka9w</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the database that you want to restore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TS2</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogPosition")
    public Long logPosition;

    /**
     * <p>The ID of the client where the primary node of the SAP HANA resides.</p>
     * 
     * <strong>example:</strong>
     * <p>c-000ii8tzv**********</p>
     */
    @NameInMap("MasterClientId")
    public String masterClientId;

    /**
     * <p>The recovery mode. Valid values:</p>
     * <ul>
     * <li><strong>RECOVERY_TO_MOST_RECENT</strong>: restores the database to the recently available state to which the database has been backed up.</li>
     * <li><strong>RECOVERY_TO_POINT_IN_TIME</strong>: restores the database to a specified point in time.</li>
     * <li><strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>: restores the database to a specified backup.</li>
     * <li><strong>RECOVERY_TO_LOG_POSITION</strong>: restores the database to a specified log position.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RECOVERY_TO_POINT_IN_TIME</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_POINT_IN_TIME</strong>. HBR restores the database to a state closest to the specified point in time.</p>
     * 
     * <strong>example:</strong>
     * <p>1635315505</p>
     */
    @NameInMap("RecoveryPointInTime")
    public Long recoveryPointInTime;

    /**
     * <p>The SID admin account that is created by SAP HANA.</p>
     * 
     * <strong>example:</strong>
     * <p>DB</p>
     */
    @NameInMap("SidAdmin")
    public String sidAdmin;

    /**
     * <p>The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the <code>&lt;Source database name&gt;@SID</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>HNP@HNP</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the source SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000ii8tzv******xm0t</p>
     */
    @NameInMap("SourceClusterId")
    public String sourceClusterId;

    /**
     * <p>Specifies whether to restore the database to a different instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SystemCopy")
    public Boolean systemCopy;

    /**
     * <p>Specifies whether to use a catalog backup to restore the database. This parameter is required only if you set the Mode parameter to <strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>. If you turn off Use Catalog, you must specify the prefix of a backup file. Then, Cloud Backup finds the backup file based on the specified prefix and restores the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCatalog")
    public Boolean useCatalog;

    /**
     * <p>Specifies whether to use a differential backup or an incremental backup to restore the database. Valid values: true and false. If you want to use a differential backup or an incremental backup to restore the database, set the value to true. If you set the value to false, HBR uses a log backup to restore the database.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseDelta")
    public Boolean useDelta;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000************yqr</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    /**
     * <p>The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VolumeId")
    public Integer volumeId;

    public static CreateHanaRestoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaRestoreRequest self = new CreateHanaRestoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateHanaRestoreRequest setBackupId(Long backupId) {
        this.backupId = backupId;
        return this;
    }
    public Long getBackupId() {
        return this.backupId;
    }

    public CreateHanaRestoreRequest setBackupPrefix(String backupPrefix) {
        this.backupPrefix = backupPrefix;
        return this;
    }
    public String getBackupPrefix() {
        return this.backupPrefix;
    }

    public CreateHanaRestoreRequest setCheckAccess(Boolean checkAccess) {
        this.checkAccess = checkAccess;
        return this;
    }
    public Boolean getCheckAccess() {
        return this.checkAccess;
    }

    public CreateHanaRestoreRequest setClearLog(Boolean clearLog) {
        this.clearLog = clearLog;
        return this;
    }
    public Boolean getClearLog() {
        return this.clearLog;
    }

    public CreateHanaRestoreRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateHanaRestoreRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateHanaRestoreRequest setLogPosition(Long logPosition) {
        this.logPosition = logPosition;
        return this;
    }
    public Long getLogPosition() {
        return this.logPosition;
    }

    public CreateHanaRestoreRequest setMasterClientId(String masterClientId) {
        this.masterClientId = masterClientId;
        return this;
    }
    public String getMasterClientId() {
        return this.masterClientId;
    }

    public CreateHanaRestoreRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateHanaRestoreRequest setRecoveryPointInTime(Long recoveryPointInTime) {
        this.recoveryPointInTime = recoveryPointInTime;
        return this;
    }
    public Long getRecoveryPointInTime() {
        return this.recoveryPointInTime;
    }

    public CreateHanaRestoreRequest setSidAdmin(String sidAdmin) {
        this.sidAdmin = sidAdmin;
        return this;
    }
    public String getSidAdmin() {
        return this.sidAdmin;
    }

    public CreateHanaRestoreRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateHanaRestoreRequest setSourceClusterId(String sourceClusterId) {
        this.sourceClusterId = sourceClusterId;
        return this;
    }
    public String getSourceClusterId() {
        return this.sourceClusterId;
    }

    public CreateHanaRestoreRequest setSystemCopy(Boolean systemCopy) {
        this.systemCopy = systemCopy;
        return this;
    }
    public Boolean getSystemCopy() {
        return this.systemCopy;
    }

    public CreateHanaRestoreRequest setUseCatalog(Boolean useCatalog) {
        this.useCatalog = useCatalog;
        return this;
    }
    public Boolean getUseCatalog() {
        return this.useCatalog;
    }

    public CreateHanaRestoreRequest setUseDelta(Boolean useDelta) {
        this.useDelta = useDelta;
        return this;
    }
    public Boolean getUseDelta() {
        return this.useDelta;
    }

    public CreateHanaRestoreRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public CreateHanaRestoreRequest setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public Integer getVolumeId() {
        return this.volumeId;
    }

}
