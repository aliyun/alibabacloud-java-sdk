// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisByBackendResponseBody body;

    public static DescribeApisByBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByBackendResponse self = new DescribeApisByBackendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisByBackendResponse setBody(DescribeApisByBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByBackendResponseBody getBody() {
        return this.body;
    }

}
