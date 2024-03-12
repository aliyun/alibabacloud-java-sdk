// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class AttachExpressConnectRouterChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachExpressConnectRouterChildInstanceResponseBody body;

    public static AttachExpressConnectRouterChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachExpressConnectRouterChildInstanceResponse self = new AttachExpressConnectRouterChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AttachExpressConnectRouterChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachExpressConnectRouterChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachExpressConnectRouterChildInstanceResponse setBody(AttachExpressConnectRouterChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachExpressConnectRouterChildInstanceResponseBody getBody() {
        return this.body;
    }

}
