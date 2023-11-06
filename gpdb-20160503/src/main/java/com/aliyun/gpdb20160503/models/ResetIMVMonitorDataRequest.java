// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetIMVMonitorDataRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    public static ResetIMVMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetIMVMonitorDataRequest self = new ResetIMVMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public ResetIMVMonitorDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ResetIMVMonitorDataRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

}
