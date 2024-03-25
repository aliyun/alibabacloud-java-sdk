// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeInstanceFromTransitRouterResponseBody body;

    public static RevokeInstanceFromTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromTransitRouterResponse self = new RevokeInstanceFromTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceFromTransitRouterResponse setBody(RevokeInstanceFromTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromTransitRouterResponseBody getBody() {
        return this.body;
    }

}
