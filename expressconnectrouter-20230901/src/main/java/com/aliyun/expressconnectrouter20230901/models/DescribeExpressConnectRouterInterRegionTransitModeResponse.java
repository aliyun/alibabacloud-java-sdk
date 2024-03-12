// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterInterRegionTransitModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody body;

    public static DescribeExpressConnectRouterInterRegionTransitModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterInterRegionTransitModeResponse self = new DescribeExpressConnectRouterInterRegionTransitModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponse setBody(DescribeExpressConnectRouterInterRegionTransitModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody getBody() {
        return this.body;
    }

}
