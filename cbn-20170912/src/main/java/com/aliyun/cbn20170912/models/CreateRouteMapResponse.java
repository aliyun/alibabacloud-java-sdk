// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteMapResponseBody body;

    public static CreateRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapResponse self = new CreateRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteMapResponse setBody(CreateRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteMapResponseBody getBody() {
        return this.body;
    }

}
