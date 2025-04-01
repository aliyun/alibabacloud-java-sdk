// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppResourceStatusResponseBody body;

    public static GetEdgeContainerAppResourceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceStatusResponse self = new GetEdgeContainerAppResourceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppResourceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppResourceStatusResponse setBody(GetEdgeContainerAppResourceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppResourceStatusResponseBody getBody() {
        return this.body;
    }

}
