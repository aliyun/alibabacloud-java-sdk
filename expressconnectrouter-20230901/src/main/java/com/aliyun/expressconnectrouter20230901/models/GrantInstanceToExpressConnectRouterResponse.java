// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class GrantInstanceToExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantInstanceToExpressConnectRouterResponseBody body;

    public static GrantInstanceToExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToExpressConnectRouterResponse self = new GrantInstanceToExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantInstanceToExpressConnectRouterResponse setBody(GrantInstanceToExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
