// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupsAsyncRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-00098******yuqvu</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>BPD</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to include differential backups in the query results. Valid values:</p>
     * <ul>
     * <li>true: includes differential backups.</li>
     * <li>false: excludes differential backups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDifferential")
    public Boolean includeDifferential;

    /**
     * <p>Specifies whether to include incremental backups in the query results. Valid values:</p>
     * <ul>
     * <li>true: includes incremental backups.</li>
     * <li>false: excludes incremental backups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeIncremental")
    public Boolean includeIncremental;

    /**
     * <p>Specifies whether to include log backups in the query results. Valid values:</p>
     * <ul>
     * <li>true: includes log backups.</li>
     * <li>false: excludes log backups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeLog")
    public Boolean includeLog;

    /**
     * <p>The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogPosition")
    public Long logPosition;

    /**
     * <p>The recovery mode. Valid values:</p>
     * <ul>
     * <li><strong>RECOVERY_TO_MOST_RECENT</strong>: restores the database to the recently available state to which the database has been backed up.</li>
     * <li><strong>RECOVERY_TO_POINT_IN_TIME</strong>: restores the database to a specified point in time.</li>
     * <li><strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>: restores the database to a specified backup.</li>
     * <li><strong>RECOVERY_TO_LOG_POSITION</strong>: restores the database to a specified log position.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RECOVERY_TO_SPECIFIC_BACKUP</p>
     */
    @NameInMap("Mode")
    public String mode;

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
     * <p>The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_POINT_IN_TIME</strong>. Cloud Backup restores the database to a state closest to the specified point in time.</p>
     * 
     * <strong>example:</strong>
     * <p>1649851200</p>
     */
    @NameInMap("RecoveryPointInTime")
    public Long recoveryPointInTime;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmz7mced2ldhy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the <code>&lt;Source database name&gt;@SID</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>P01@HP1</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the source SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-0000g3m******5cj</p>
     */
    @NameInMap("SourceClusterId")
    public String sourceClusterId;

    /**
     * <p>Specifies whether to restore the database to a different instance.</p>
     * <ul>
     * <li>true: restores the database to a different instance.</li>
     * <li>false: restores the database within the same instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SystemCopy")
    public Boolean systemCopy;

    /**
     * <p>Specifies whether Backint is used. Valid values:</p>
     * <ul>
     * <li>true: Backint is used.</li>
     * <li>false: Backint is not used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseBackint")
    public Boolean useBackint;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000270c******pi81</p>
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
