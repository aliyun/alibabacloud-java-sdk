// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ForceDeleteExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForceDeleteExpressConnectRouterResponseBody body;

    public static ForceDeleteExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        ForceDeleteExpressConnectRouterResponse self = new ForceDeleteExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public ForceDeleteExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForceDeleteExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForceDeleteExpressConnectRouterResponse setBody(ForceDeleteExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public ForceDeleteExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
