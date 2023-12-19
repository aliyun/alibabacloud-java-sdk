// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupsAsyncRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to include differential backups in the query results. Valid values:</p>
     * <br>
     * <p>*   true: includes differential backups.</p>
     * <p>*   false: excludes differential backups.</p>
     */
    @NameInMap("IncludeDifferential")
    public Boolean includeDifferential;

    /**
     * <p>Specifies whether to include incremental backups in the query results. Valid values:</p>
     * <br>
     * <p>*   true: includes incremental backups.</p>
     * <p>*   false: excludes incremental backups.</p>
     */
    @NameInMap("IncludeIncremental")
    public Boolean includeIncremental;

    /**
     * <p>Specifies whether to include log backups in the query results. Valid values:</p>
     * <br>
     * <p>*   true: includes log backups.</p>
     * <p>*   false: excludes log backups.</p>
     */
    @NameInMap("IncludeLog")
    public Boolean includeLog;

    /**
     * <p>The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.</p>
     */
    @NameInMap("LogPosition")
    public Long logPosition;

    /**
     * <p>The recovery mode. Valid values:</p>
     * <br>
     * <p>*   **RECOVERY_TO_MOST_RECENT**: restores the database to the recently available state to which the database has been backed up.</p>
     * <p>*   **RECOVERY_TO_POINT_IN_TIME**: restores the database to a specified point in time.</p>
     * <p>*   **RECOVERY_TO_SPECIFIC_BACKUP**: restores the database to a specified backup.</p>
     * <p>*   **RECOVERY_TO_LOG_POSITION**: restores the database to a specified log position.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_POINT_IN_TIME**. HBR restores the database to a state closest to the specified point in time.</p>
     */
    @NameInMap("RecoveryPointInTime")
    public Long recoveryPointInTime;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the `<Source database name>@SID` format.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the source SAP HANA instance.</p>
     */
    @NameInMap("SourceClusterId")
    public String sourceClusterId;

    /**
     * <p>Specifies whether to restore the database to a different instance. Valid values:</p>
     * <br>
     * <p>*   true: restores the database to a different instance.</p>
     * <p>*   false: restores the database within the same instance.</p>
     */
    @NameInMap("SystemCopy")
    public Boolean systemCopy;

    /**
     * <p>Specifies whether Backint is used. Valid values:</p>
     * <br>
     * <p>*   true: Backint is used.</p>
     * <p>*   false: Backint is not used.</p>
     */
    @NameInMap("UseBackint")
    public Boolean useBackint;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    /**
     * <p>The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.</p>
     */
    @NameInMap("VolumeId")
    public Integer volumeId;

    public static DescribeHanaBackupsAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupsAsyncRequest self = new DescribeHanaBackupsAsyncRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupsAsyncRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHanaBackupsAsyncRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeHanaBackupsAsyncRequest setIncludeDifferential(Boolean includeDifferential) {
        this.includeDifferential = includeDifferential;
        return this;
    }
    public Boolean getIncludeDifferential() {
        return this.includeDifferential;
    }

    public DescribeHanaBackupsAsyncRequest setIncludeIncremental(Boolean includeIncremental) {
        this.includeIncremental = includeIncremental;
        return this;
    }
    public Boolean getIncludeIncremental() {
        return this.includeIncremental;
    }

    public DescribeHanaBackupsAsyncRequest setIncludeLog(Boolean includeLog) {
        this.includeLog = includeLog;
        return this;
    }
    public Boolean getIncludeLog() {
        return this.includeLog;
    }

    public DescribeHanaBackupsAsyncRequest setLogPosition(Long logPosition) {
        this.logPosition = logPosition;
        return this;
    }
    public Long getLogPosition() {
        return this.logPosition;
    }

    public DescribeHanaBackupsAsyncRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeHanaBackupsAsyncRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaBackupsAsyncRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaBackupsAsyncRequest setRecoveryPointInTime(Long recoveryPointInTime) {
        this.recoveryPointInTime = recoveryPointInTime;
        return this;
    }
    public Long getRecoveryPointInTime() {
        return this.recoveryPointInTime;
    }

    public DescribeHanaBackupsAsyncRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHanaBackupsAsyncRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeHanaBackupsAsyncRequest setSourceClusterId(String sourceClusterId) {
        this.sourceClusterId = sourceClusterId;
        return this;
    }
    public String getSourceClusterId() {
        return this.sourceClusterId;
    }

    public DescribeHanaBackupsAsyncRequest setSystemCopy(Boolean systemCopy) {
        this.systemCopy = systemCopy;
        return this;
    }
    public Boolean getSystemCopy() {
        return this.systemCopy;
    }

    public DescribeHanaBackupsAsyncRequest setUseBackint(Boolean useBackint) {
        this.useBackint = useBackint;
        return this;
    }
    public Boolean getUseBackint() {
        return this.useBackint;
    }

    public DescribeHanaBackupsAsyncRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public DescribeHanaBackupsAsyncRequest setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public Integer getVolumeId() {
        return this.volumeId;
    }

}
