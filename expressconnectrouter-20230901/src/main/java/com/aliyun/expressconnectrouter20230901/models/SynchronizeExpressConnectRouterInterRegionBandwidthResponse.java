// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class SynchronizeExpressConnectRouterInterRegionBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponseBody body;

    public static SynchronizeExpressConnectRouterInterRegionBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeExpressConnectRouterInterRegionBandwidthResponse self = new SynchronizeExpressConnectRouterInterRegionBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse setBody(SynchronizeExpressConnectRouterInterRegionBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponseBody getBody() {
        return this.body;
    }

}
