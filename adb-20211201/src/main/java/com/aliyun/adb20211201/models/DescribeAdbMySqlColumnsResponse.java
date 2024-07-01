// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbMySqlColumnsResponseBody body;

    public static DescribeAdbMySqlColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlColumnsResponse self = new DescribeAdbMySqlColumnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlColumnsResponse setBody(DescribeAdbMySqlColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlColumnsResponseBody getBody() {
        return this.body;
    }

}
