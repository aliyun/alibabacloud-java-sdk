// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class GetExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExpressConnectRouterResponseBody body;

    public static GetExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExpressConnectRouterResponse self = new GetExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public GetExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExpressConnectRouterResponse setBody(GetExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
