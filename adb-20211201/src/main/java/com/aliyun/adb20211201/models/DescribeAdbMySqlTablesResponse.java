// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbMySqlTablesResponseBody body;

    public static DescribeAdbMySqlTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlTablesResponse self = new DescribeAdbMySqlTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlTablesResponse setBody(DescribeAdbMySqlTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlTablesResponseBody getBody() {
        return this.body;
    }

}
