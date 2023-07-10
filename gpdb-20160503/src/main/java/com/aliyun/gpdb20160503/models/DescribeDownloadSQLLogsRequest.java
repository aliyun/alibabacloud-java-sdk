// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadSQLLogsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDownloadSQLLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadSQLLogsRequest self = new DescribeDownloadSQLLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadSQLLogsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
