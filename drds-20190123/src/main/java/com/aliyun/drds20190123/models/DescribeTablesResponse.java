// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTablesResponseBody body;

    public static DescribeTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponse self = new DescribeTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTablesResponse setBody(DescribeTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTablesResponseBody getBody() {
        return this.body;
    }

}
