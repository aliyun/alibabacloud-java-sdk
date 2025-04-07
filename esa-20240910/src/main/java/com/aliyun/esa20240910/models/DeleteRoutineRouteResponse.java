// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineRouteResponseBody body;

    public static DeleteRoutineRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRouteResponse self = new DeleteRoutineRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineRouteResponse setBody(DeleteRoutineRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineRouteResponseBody getBody() {
        return this.body;
    }

}
