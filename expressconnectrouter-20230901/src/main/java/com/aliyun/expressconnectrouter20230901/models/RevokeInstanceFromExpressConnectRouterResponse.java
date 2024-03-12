// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeInstanceFromExpressConnectRouterResponseBody body;

    public static RevokeInstanceFromExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromExpressConnectRouterResponse self = new RevokeInstanceFromExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceFromExpressConnectRouterResponse setBody(RevokeInstanceFromExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
