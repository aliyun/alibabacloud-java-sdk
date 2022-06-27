// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDownloadRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadRecordsRequest self = new DescribeDownloadRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
