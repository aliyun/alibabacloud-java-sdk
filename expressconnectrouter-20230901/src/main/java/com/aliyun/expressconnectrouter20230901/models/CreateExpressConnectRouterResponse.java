// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressConnectRouterResponseBody body;

    public static CreateExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectRouterResponse self = new CreateExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressConnectRouterResponse setBody(CreateExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
