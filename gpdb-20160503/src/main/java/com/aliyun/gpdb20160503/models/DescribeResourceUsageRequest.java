// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageRequest self = new DescribeResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
