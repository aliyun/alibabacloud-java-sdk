// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpApiRouteResponseBody body;

    public static UpdateHttpApiRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRouteResponse self = new UpdateHttpApiRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpApiRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpApiRouteResponse setBody(UpdateHttpApiRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpApiRouteResponseBody getBody() {
        return this.body;
    }

}
