// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateErRouteMapResponseBody body;

    public static CreateErRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateErRouteMapResponse self = new CreateErRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public CreateErRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateErRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateErRouteMapResponse setBody(CreateErRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateErRouteMapResponseBody getBody() {
        return this.body;
    }

}
