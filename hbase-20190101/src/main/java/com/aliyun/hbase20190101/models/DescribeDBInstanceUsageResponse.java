// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDBInstanceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceUsageResponse setBody(DescribeDBInstanceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceUsageResponseBody getBody() {
        return this.body;
    }

}
