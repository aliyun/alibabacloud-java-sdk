// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class GrantInstanceToTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantInstanceToTransitRouterResponseBody body;

    public static GrantInstanceToTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToTransitRouterResponse self = new GrantInstanceToTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantInstanceToTransitRouterResponse setBody(GrantInstanceToTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToTransitRouterResponseBody getBody() {
        return this.body;
    }

}
