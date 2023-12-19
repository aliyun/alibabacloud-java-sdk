// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRestoresRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

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
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the restore job.</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    /**
     * <p>The status of the restore job. Valid values:</p>
     * <br>
     * <p>*   **RUNNING**: The restore job is running.</p>
     * <p>*   **COMPLETE**: The restore job is completed.</p>
     * <p>*   **PARTIAL_COMPLETE**: The restore job is partially completed.</p>
     * <p>*   **FAILED**: The restore job has failed.</p>
     * <p>*   **CANCELED**: The restore job is canceled.</p>
     * <p>*   **EXPIRED**: The restore job has timed out.</p>
     */
    @NameInMap("RestoreStatus")
    public String restoreStatus;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DescribeHanaRestoresRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRestoresRequest self = new DescribeHanaRestoresRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRestoresRequest setBackupId(Long backupId) {
        this.backupId = backupId;
        return this;
    }
    public Long getBackupId() {
        return this.backupId;
    }

    public DescribeHanaRestoresRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHanaRestoresRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeHanaRestoresRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaRestoresRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaRestoresRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHanaRestoresRequest setRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }
    public String getRestoreId() {
        return this.restoreId;
    }

    public DescribeHanaRestoresRequest setRestoreStatus(String restoreStatus) {
        this.restoreStatus = restoreStatus;
        return this;
    }
    public String getRestoreStatus() {
        return this.restoreStatus;
    }

    public DescribeHanaRestoresRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
