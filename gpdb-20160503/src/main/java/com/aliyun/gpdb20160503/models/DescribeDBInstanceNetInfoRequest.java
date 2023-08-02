// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoRequest extends TeaModel {
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query details about all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDBInstanceNetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoRequest self = new DescribeDBInstanceNetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBInstanceNetInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
