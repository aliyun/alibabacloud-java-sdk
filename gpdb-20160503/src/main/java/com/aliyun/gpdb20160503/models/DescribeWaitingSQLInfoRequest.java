// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The ID of the process that uniquely identifies the query.</p>
     * <br>
     * <p>>  You can call the [DescribeWaitingSQLRecords](https://help.aliyun.com/document_detail/461735.html) operation to obtain the process IDs of lock-waiting queries.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PID")
    public String PID;

    public static DescribeWaitingSQLInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingSQLInfoRequest self = new DescribeWaitingSQLInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingSQLInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeWaitingSQLInfoRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeWaitingSQLInfoRequest setPID(String PID) {
        this.PID = PID;
        return this;
    }
    public String getPID() {
        return this.PID;
    }

}
