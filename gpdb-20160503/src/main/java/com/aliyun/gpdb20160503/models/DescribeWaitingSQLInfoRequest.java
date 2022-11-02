// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLInfoRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

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
