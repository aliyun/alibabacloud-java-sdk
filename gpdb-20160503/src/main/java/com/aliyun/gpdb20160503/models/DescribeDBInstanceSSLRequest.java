// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLRequest self = new DescribeDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
