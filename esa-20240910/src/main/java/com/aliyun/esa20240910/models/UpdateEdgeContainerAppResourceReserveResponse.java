// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeContainerAppResourceReserveResponseBody body;

    public static UpdateEdgeContainerAppResourceReserveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppResourceReserveResponse self = new UpdateEdgeContainerAppResourceReserveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppResourceReserveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeContainerAppResourceReserveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeContainerAppResourceReserveResponse setBody(UpdateEdgeContainerAppResourceReserveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeContainerAppResourceReserveResponseBody getBody() {
        return this.body;
    }

}
