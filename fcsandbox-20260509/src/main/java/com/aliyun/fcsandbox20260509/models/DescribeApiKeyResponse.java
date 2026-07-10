// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiKeyResponseBody body;

    public static DescribeApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiKeyResponse self = new DescribeApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiKeyResponse setBody(DescribeApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiKeyResponseBody getBody() {
        return this.body;
    }

}
