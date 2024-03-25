// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ResolveAndRouteServiceInCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResolveAndRouteServiceInCenResponseBody body;

    public static ResolveAndRouteServiceInCenResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveAndRouteServiceInCenResponse self = new ResolveAndRouteServiceInCenResponse();
        return TeaModel.build(map, self);
    }

    public ResolveAndRouteServiceInCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveAndRouteServiceInCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResolveAndRouteServiceInCenResponse setBody(ResolveAndRouteServiceInCenResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveAndRouteServiceInCenResponseBody getBody() {
        return this.body;
    }

}
