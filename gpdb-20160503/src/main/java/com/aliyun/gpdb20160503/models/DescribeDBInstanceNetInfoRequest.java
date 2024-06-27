// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoRequest extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the instance.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the information about all endpoints of the instance is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-0xin9q82c33xc****-master.gpdb.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxxx</p>
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
