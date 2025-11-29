// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CloneDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the IDs of all backup sets of the instance. Only snapshot backup sets are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the new instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the source instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    public static CloneDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceRequest self = new CloneDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CloneDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CloneDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CloneDBInstanceRequest setSrcDbInstanceName(String srcDbInstanceName) {
        this.srcDbInstanceName = srcDbInstanceName;
        return this;
    }
    public String getSrcDbInstanceName() {
        return this.srcDbInstanceName;
    }

}
