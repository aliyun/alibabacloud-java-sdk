// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeJDBCDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static DescribeJDBCDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJDBCDataSourceRequest self = new DescribeJDBCDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJDBCDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeJDBCDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
