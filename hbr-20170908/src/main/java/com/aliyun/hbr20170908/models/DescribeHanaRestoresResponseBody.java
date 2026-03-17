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
        @NameInMap("BackupID")
        public Long backupID;

        @NameInMap("BackupPrefix")
        public String backupPrefix;

        @NameInMap("CheckAccess")
        public Boolean checkAccess;

        @NameInMap("ClearLog")
        public Boolean clearLog;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CurrentPhase")
        public Integer currentPhase;

        @NameInMap("CurrentProgress")
        public Long currentProgress;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatabaseRestoreId")
        public Long databaseRestoreId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LogPosition")
        public Long logPosition;

        @NameInMap("MaxPhase")
        public Integer maxPhase;

        @NameInMap("MaxProgress")
        public Long maxProgress;

        @NameInMap("Message")
        public String message;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("ReachedTime")
        public Long reachedTime;

        @NameInMap("RecoveryPointInTime")
        public Long recoveryPointInTime;

        @NameInMap("RestoreId")
        public String restoreId;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceClusterId")
        public String sourceClusterId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("SystemCopy")
        public Boolean systemCopy;

        @NameInMap("UseCatalog")
        public Boolean useCatalog;

        @NameInMap("UseDelta")
        public Boolean useDelta;

        @NameInMap("VaultId")
        public String vaultId;

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
