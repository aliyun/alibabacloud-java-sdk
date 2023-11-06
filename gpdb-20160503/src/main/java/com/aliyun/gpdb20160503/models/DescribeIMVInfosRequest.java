// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIMVInfosRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("MVName")
    public String MVName;

    public static DescribeIMVInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMVInfosRequest self = new DescribeIMVInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIMVInfosRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeIMVInfosRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeIMVInfosRequest setMVName(String MVName) {
        this.MVName = MVName;
        return this;
    }
    public String getMVName() {
        return this.MVName;
    }

}
