// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIndexUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceIndexUsageResponseBody body;

    public static DescribeDBInstanceIndexUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIndexUsageResponse self = new DescribeDBInstanceIndexUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIndexUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceIndexUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceIndexUsageResponse setBody(DescribeDBInstanceIndexUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceIndexUsageResponseBody getBody() {
        return this.body;
    }

}
