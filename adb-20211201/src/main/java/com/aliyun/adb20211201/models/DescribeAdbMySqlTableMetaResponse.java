// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbMySqlTableMetaResponseBody body;

    public static DescribeAdbMySqlTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlTableMetaResponse self = new DescribeAdbMySqlTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlTableMetaResponse setBody(DescribeAdbMySqlTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlTableMetaResponseBody getBody() {
        return this.body;
    }

}
