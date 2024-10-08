// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRestoresResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about restore jobs.</p>
     */
    @NameInMap("HanaRestore")
    public DescribeHanaRestoresResponseBodyHanaRestore hanaRestore;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7DEFC897-8F05-5C05-912C-C9A9510FBFF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHanaRestoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRestoresResponseBody self = new DescribeHanaRestoresResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRestoresResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaRestoresResponseBody setHanaRestore(DescribeHanaRestoresResponseBodyHanaRestore hanaRestore) {
        this.hanaRestore = hanaRestore;
        return this;
    }
    public DescribeHanaRestoresResponseBodyHanaRestore getHanaRestore() {
        return this.hanaRestore;
    }

    public DescribeHanaRestoresResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaRestoresResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaRestoresResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaRestoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaRestoresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHanaRestoresResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores extends TeaModel {
        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1635315505</p>
         */
        @NameInMap("BackupID")
        public Long backupID;

        /**
         * <p>The backup prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>INC_DATA_BACKUP</p>
         */
        @NameInMap("BackupPrefix")
        public String backupPrefix;

        /**
         * <p>Indicates whether the differential backup and log backup are validated. Valid values:</p>
         * <ul>
         * <li>true: Cloud Backup checks whether the required differential backup and log backup are available before the restore job starts. If the differential backup or log backup is unavailable, Cloud Backup does not start the restore job.</li>
         * <li>false: Cloud Backup does not check whether the required differential backup and log backup are available before the restore job starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckAccess")
        public Boolean checkAccess;

        /**
         * <p>Indicates whether all log entries are deleted from the log area after the log entries are restored. Valid values: true and false. If the return value is false, all log entries are deleted from the log area after the log entries are restored.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClearLog")
        public Boolean clearLog;

        /**
         * <p>The ID of the SAP HANA instance that is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000923yu******p00j4</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The current recovery phase. This value is obtained from SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentPhase")
        public Integer currentPhase;

        /**
         * <p>The current progress. This value is obtained from SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentProgress")
        public Long currentProgress;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>BWD</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The ID of the database recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>1644038961030</p>
         */
        @NameInMap("DatabaseRestoreId")
        public Long databaseRestoreId;

        /**
         * <p>The time when the restore job ends. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634356382</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The log position to which the database is restored. This parameter is returned only if the value of the Mode parameter is <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LogPosition")
        public Long logPosition;

        /**
         * <p>The maximum recovery phase. This value is obtained from SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxPhase")
        public Integer maxPhase;

        /**
         * <p>The maximum progress. This value is obtained from SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxProgress")
        public Long maxProgress;

        /**
         * <p>The details of the recovery phase.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Error 448 - recovery could not be completed:</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The recovery mode. Valid values:</p>
         * <ul>
         * <li><strong>RECOVERY_TO_MOST_RECENT</strong>: The database is restored to the recently available state to which the database has been backed up.</li>
         * <li><strong>RECOVERY_TO_POINT_IN_TIME</strong>: The database is restored to a specified point in time.</li>
         * <li><strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>: The database is restored to a specified backup.</li>
         * <li><strong>RECOVERY_TO_LOG_POSITION</strong>: The database is restored to a specified log position.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RECOVERY_TO_SPECIFIC_BACKUP</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The recovery phase.</p>
         * 
         * <strong>example:</strong>
         * <p>restart</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The point in time at which the database is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>1635315505</p>
         */
        @NameInMap("ReachedTime")
        public Long reachedTime;

        /**
         * <p>The point in time to which the database is restored. This parameter is returned only if the value of the Mode parameter is <strong>RECOVERY_TO_POINT_IN_TIME</strong>. Cloud Backup restores the database to a state closest to the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1649851200</p>
         */
        @NameInMap("RecoveryPointInTime")
        public Long recoveryPointInTime;

        /**
         * <p>The ID of the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>r-000c1en183ayn9sesgqh</p>
         */
        @NameInMap("RestoreId")
        public String restoreId;

        /**
         * <p>The name of the source system. This parameter indicates the name of the source database that is restored. Format: <code>&lt;Source database name&gt;@SID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PRD@H4P</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the source SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0000g3mvy******5cj</p>
         */
        @NameInMap("SourceClusterId")
        public String sourceClusterId;

        /**
         * <p>The time when the restore job starts. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1636970413</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The recovery status. This value is obtained from SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the restore job. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The job is running.</li>
         * <li><strong>COMPLETE</strong>: The job is completed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The job is partially completed.</li>
         * <li><strong>FAILED</strong>: The job failed.</li>
         * <li><strong>CANCELED</strong>: The job is canceled.</li>
         * <li><strong>EXPIRED</strong>: The job timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the database is restored to a different instance. Valid values:</p>
         * <ul>
         * <li>true: The database is restored to a different instance.</li>
         * <li>false: The database is restored within the same instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SystemCopy")
        public Boolean systemCopy;

        /**
         * <p>Indicates whether a catalog backup is used to restore the database. This parameter is returned only if the value of the Mode parameter is <strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>. If the return value is false, Cloud Backup finds the backup file based on the specified prefix and then restores the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseCatalog")
        public Boolean useCatalog;

        /**
         * <p>Indicates whether a differential backup or an incremental backup is used to restore the database. Valid values: true and false. If the return value is true, Cloud Backup uses a differential backup or an incremental backup to restore the database. If the return value is false, Cloud Backup uses a log backup to restore the database.</p>
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
         * <p>v-000g9acf******gta</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        /**
         * <p>The ID of the volume that is restored. This parameter is returned only if the value of the Mode parameter is <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VolumeId")
        public Integer volumeId;

        public static DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores self = new DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores();
            return TeaModel.build(map, self);
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setBackupID(Long backupID) {
            this.backupID = backupID;
            return this;
        }
        public Long getBackupID() {
            return this.backupID;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setBackupPrefix(String backupPrefix) {
            this.backupPrefix = backupPrefix;
            return this;
        }
        public String getBackupPrefix() {
            return this.backupPrefix;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setCheckAccess(Boolean checkAccess) {
            this.checkAccess = checkAccess;
            return this;
        }
        public Boolean getCheckAccess() {
            return this.checkAccess;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setClearLog(Boolean clearLog) {
            this.clearLog = clearLog;
            return this;
        }
        public Boolean getClearLog() {
            return this.clearLog;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setCurrentPhase(Integer currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public Integer getCurrentPhase() {
            return this.currentPhase;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setCurrentProgress(Long currentProgress) {
            this.currentProgress = currentProgress;
            return this;
        }
        public Long getCurrentProgress() {
            return this.currentProgress;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setDatabaseRestoreId(Long databaseRestoreId) {
            this.databaseRestoreId = databaseRestoreId;
            return this;
        }
        public Long getDatabaseRestoreId() {
            return this.databaseRestoreId;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setLogPosition(Long logPosition) {
            this.logPosition = logPosition;
            return this;
        }
        public Long getLogPosition() {
            return this.logPosition;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setMaxPhase(Integer maxPhase) {
            this.maxPhase = maxPhase;
            return this;
        }
        public Integer getMaxPhase() {
            return this.maxPhase;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setMaxProgress(Long maxProgress) {
            this.maxProgress = maxProgress;
            return this;
        }
        public Long getMaxProgress() {
            return this.maxProgress;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setReachedTime(Long reachedTime) {
            this.reachedTime = reachedTime;
            return this;
        }
        public Long getReachedTime() {
            return this.reachedTime;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setRecoveryPointInTime(Long recoveryPointInTime) {
            this.recoveryPointInTime = recoveryPointInTime;
            return this;
        }
        public Long getRecoveryPointInTime() {
            return this.recoveryPointInTime;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setRestoreId(String restoreId) {
            this.restoreId = restoreId;
            return this;
        }
        public String getRestoreId() {
            return this.restoreId;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setSourceClusterId(String sourceClusterId) {
            this.sourceClusterId = sourceClusterId;
            return this;
        }
        public String getSourceClusterId() {
            return this.sourceClusterId;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setSystemCopy(Boolean systemCopy) {
            this.systemCopy = systemCopy;
            return this;
        }
        public Boolean getSystemCopy() {
            return this.systemCopy;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setUseCatalog(Boolean useCatalog) {
            this.useCatalog = useCatalog;
            return this;
        }
        public Boolean getUseCatalog() {
            return this.useCatalog;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setUseDelta(Boolean useDelta) {
            this.useDelta = useDelta;
            return this;
        }
        public Boolean getUseDelta() {
            return this.useDelta;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

        public DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores setVolumeId(Integer volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Integer getVolumeId() {
            return this.volumeId;
        }

    }

    public static class DescribeHanaRestoresResponseBodyHanaRestore extends TeaModel {
        @NameInMap("HanaRestores")
        public java.util.List<DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores> hanaRestores;

        public static DescribeHanaRestoresResponseBodyHanaRestore build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaRestoresResponseBodyHanaRestore self = new DescribeHanaRestoresResponseBodyHanaRestore();
            return TeaModel.build(map, self);
        }

        public DescribeHanaRestoresResponseBodyHanaRestore setHanaRestores(java.util.List<DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores> hanaRestores) {
            this.hanaRestores = hanaRestores;
            return this;
        }
        public java.util.List<DescribeHanaRestoresResponseBodyHanaRestoreHanaRestores> getHanaRestores() {
            return this.hanaRestores;
        }

    }

}
