// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterRegionResponseBody body;

    public static DescribeExpressConnectRouterRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRegionResponse self = new DescribeExpressConnectRouterRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterRegionResponse setBody(DescribeExpressConnectRouterRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterRegionResponseBody getBody() {
        return this.body;
    }

}
