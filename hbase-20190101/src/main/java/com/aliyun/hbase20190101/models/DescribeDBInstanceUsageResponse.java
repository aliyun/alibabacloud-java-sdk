// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceUsageResponseBody body;

    public static DescribeDBInstanceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceUsageResponse self = new DescribeDBInstanceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceUsageResponse setBody(DescribeDBInstanceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceUsageResponseBody getBody() {
        return this.body;
    }

}
