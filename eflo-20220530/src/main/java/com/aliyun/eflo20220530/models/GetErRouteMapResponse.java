// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErRouteMapResponseBody body;

    public static GetErRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteMapResponse self = new GetErRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public GetErRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErRouteMapResponse setBody(GetErRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErRouteMapResponseBody getBody() {
        return this.body;
    }

}
