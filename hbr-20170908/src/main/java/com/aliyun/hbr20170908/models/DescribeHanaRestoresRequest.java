// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRestoresRequest extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1632754800158</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000b******soejg</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEMDB</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.\`</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4ebtpkzx7zy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the restore job.</p>
     * 
     * <strong>example:</strong>
     * <p>r-0007o3vqfukfe92hvf13</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

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
    @NameInMap("RestoreStatus")
    public String restoreStatus;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000au6bq******mpu</p>
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
