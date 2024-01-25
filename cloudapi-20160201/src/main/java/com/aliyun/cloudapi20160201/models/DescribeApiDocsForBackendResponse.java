// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiDocsForBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiDocsForBackendResponseBody body;

    public static DescribeApiDocsForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocsForBackendResponse self = new DescribeApiDocsForBackendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocsForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiDocsForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiDocsForBackendResponse setBody(DescribeApiDocsForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiDocsForBackendResponseBody getBody() {
        return this.body;
    }

}
