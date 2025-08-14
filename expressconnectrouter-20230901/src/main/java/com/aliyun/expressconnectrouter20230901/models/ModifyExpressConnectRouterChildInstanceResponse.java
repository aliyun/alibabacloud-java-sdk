// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectRouterChildInstanceResponseBody body;

    public static ModifyExpressConnectRouterChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterChildInstanceResponse self = new ModifyExpressConnectRouterChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectRouterChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectRouterChildInstanceResponse setBody(ModifyExpressConnectRouterChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectRouterChildInstanceResponseBody getBody() {
        return this.body;
    }

}
