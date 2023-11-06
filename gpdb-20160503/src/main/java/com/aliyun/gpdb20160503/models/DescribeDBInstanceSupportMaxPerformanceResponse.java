// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSupportMaxPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceSupportMaxPerformanceResponseBody body;

    public static DescribeDBInstanceSupportMaxPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSupportMaxPerformanceResponse self = new DescribeDBInstanceSupportMaxPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSupportMaxPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSupportMaxPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceSupportMaxPerformanceResponse setBody(DescribeDBInstanceSupportMaxPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSupportMaxPerformanceResponseBody getBody() {
        return this.body;
    }

}
