// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppStatusResponseBody body;

    public static GetEdgeContainerAppStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppStatusResponse self = new GetEdgeContainerAppStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppStatusResponse setBody(GetEdgeContainerAppStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppStatusResponseBody getBody() {
        return this.body;
    }

}
