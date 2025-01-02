// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteHttpApiRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpApiRouteResponseBody body;

    public static DeleteHttpApiRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpApiRouteResponse self = new DeleteHttpApiRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpApiRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpApiRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpApiRouteResponse setBody(DeleteHttpApiRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpApiRouteResponseBody getBody() {
        return this.body;
    }

}
