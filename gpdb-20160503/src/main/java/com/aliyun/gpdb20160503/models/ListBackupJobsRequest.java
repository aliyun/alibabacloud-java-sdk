// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBackupJobsRequest extends TeaModel {
    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li>Automated</li>
     * <li>Manual</li>
     * </ul>
     * <p>If you do not specify this parameter, all backup sets are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

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

    public static ListBackupJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBackupJobsRequest self = new ListBackupJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListBackupJobsRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public ListBackupJobsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
