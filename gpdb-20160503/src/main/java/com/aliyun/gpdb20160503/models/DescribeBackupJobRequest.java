// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBackupJobRequest extends TeaModel {
    /**
     * <p>The backup job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BackupJobId")
    public Long backupJobId;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeBackupJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobRequest self = new DescribeBackupJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobRequest setBackupJobId(Long backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Long getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupJobRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
