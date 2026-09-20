// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupTablesRequest extends TeaModel {
    /**
     * <p>The backup record ID. You can call the DescribeBackupSummary operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020110302xxxx</p>
     */
    @NameInMap("BackupRecordId")
    public String backupRecordId;

    /**
     * <p>The ID of the backup cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBackupTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTablesRequest self = new DescribeBackupTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTablesRequest setBackupRecordId(String backupRecordId) {
        this.backupRecordId = backupRecordId;
        return this;
    }
    public String getBackupRecordId() {
        return this.backupRecordId;
    }

    public DescribeBackupTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
