// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupTablesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("BackupRecordId")
    public String backupRecordId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBackupTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTablesRequest self = new DescribeBackupTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupTablesRequest setBackupRecordId(String backupRecordId) {
        this.backupRecordId = backupRecordId;
        return this;
    }
    public String getBackupRecordId() {
        return this.backupRecordId;
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
