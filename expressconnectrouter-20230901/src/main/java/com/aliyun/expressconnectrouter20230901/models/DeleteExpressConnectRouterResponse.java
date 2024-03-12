// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectRouterResponseBody body;

    public static DeleteExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectRouterResponse self = new DeleteExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectRouterResponse setBody(DeleteExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
