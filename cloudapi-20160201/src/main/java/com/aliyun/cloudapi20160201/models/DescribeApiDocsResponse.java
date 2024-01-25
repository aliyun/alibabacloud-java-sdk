// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiDocsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiDocsResponseBody body;

    public static DescribeApiDocsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocsResponse self = new DescribeApiDocsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiDocsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiDocsResponse setBody(DescribeApiDocsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiDocsResponseBody getBody() {
        return this.body;
    }

}
