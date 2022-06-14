// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceMonitorResponseBody body;

    public static DescribeDBInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponse self = new DescribeDBInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceMonitorResponse setBody(DescribeDBInstanceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceMonitorResponseBody getBody() {
        return this.body;
    }

}
