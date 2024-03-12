// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterChildInstanceResponseBody body;

    public static DescribeExpressConnectRouterChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterChildInstanceResponse self = new DescribeExpressConnectRouterChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterChildInstanceResponse setBody(DescribeExpressConnectRouterChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterChildInstanceResponseBody getBody() {
        return this.body;
    }

}
