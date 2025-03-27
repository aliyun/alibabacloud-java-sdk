// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceReserveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppResourceReserveResponseBody body;

    public static GetEdgeContainerAppResourceReserveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceReserveResponse self = new GetEdgeContainerAppResourceReserveResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceReserveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppResourceReserveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppResourceReserveResponse setBody(GetEdgeContainerAppResourceReserveResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppResourceReserveResponseBody getBody() {
        return this.body;
    }

}
