// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbMySqlSchemasResponseBody body;

    public static DescribeAdbMySqlSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlSchemasResponse self = new DescribeAdbMySqlSchemasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlSchemasResponse setBody(DescribeAdbMySqlSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlSchemasResponseBody getBody() {
        return this.body;
    }

}
