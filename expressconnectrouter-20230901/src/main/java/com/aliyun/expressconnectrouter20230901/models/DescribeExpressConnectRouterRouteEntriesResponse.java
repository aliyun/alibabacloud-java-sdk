// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterRouteEntriesResponseBody body;

    public static DescribeExpressConnectRouterRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRouteEntriesResponse self = new DescribeExpressConnectRouterRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterRouteEntriesResponse setBody(DescribeExpressConnectRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
