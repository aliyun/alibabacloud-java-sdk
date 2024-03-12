// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterResponseBody body;

    public static DescribeExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterResponse self = new DescribeExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterResponse setBody(DescribeExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
