// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeDisabledExpressConnectRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody body;

    public static DescribeDisabledExpressConnectRouterRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisabledExpressConnectRouterRouteEntriesResponse self = new DescribeDisabledExpressConnectRouterRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponse setBody(DescribeDisabledExpressConnectRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
