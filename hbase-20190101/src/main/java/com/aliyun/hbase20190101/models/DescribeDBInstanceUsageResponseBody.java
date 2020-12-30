// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DescribeDBInstanceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceUsageResponseBody self = new DescribeDBInstanceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceUsageResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
