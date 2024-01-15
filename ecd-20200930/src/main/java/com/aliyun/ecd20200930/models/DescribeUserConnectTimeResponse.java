// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserConnectTimeResponseBody body;

    public static DescribeUserConnectTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectTimeResponse self = new DescribeUserConnectTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserConnectTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserConnectTimeResponse setBody(DescribeUserConnectTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserConnectTimeResponseBody getBody() {
        return this.body;
    }

}
