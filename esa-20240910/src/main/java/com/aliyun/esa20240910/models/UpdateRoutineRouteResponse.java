// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRoutineRouteResponseBody body;

    public static UpdateRoutineRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineRouteResponse self = new UpdateRoutineRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoutineRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRoutineRouteResponse setBody(UpdateRoutineRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoutineRouteResponseBody getBody() {
        return this.body;
    }

}
