// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceStatusResponseBody body;

    public static DescribeDBInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceStatusResponse self = new DescribeDBInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceStatusResponse setBody(DescribeDBInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
