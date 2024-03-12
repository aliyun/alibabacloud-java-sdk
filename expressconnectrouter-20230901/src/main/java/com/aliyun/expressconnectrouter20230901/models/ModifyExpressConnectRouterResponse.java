// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectRouterResponseBody body;

    public static ModifyExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterResponse self = new ModifyExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectRouterResponse setBody(ModifyExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
