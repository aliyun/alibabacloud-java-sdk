// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DetachExpressConnectRouterChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachExpressConnectRouterChildInstanceResponseBody body;

    public static DetachExpressConnectRouterChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachExpressConnectRouterChildInstanceResponse self = new DetachExpressConnectRouterChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DetachExpressConnectRouterChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachExpressConnectRouterChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachExpressConnectRouterChildInstanceResponse setBody(DetachExpressConnectRouterChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachExpressConnectRouterChildInstanceResponseBody getBody() {
        return this.body;
    }

}
