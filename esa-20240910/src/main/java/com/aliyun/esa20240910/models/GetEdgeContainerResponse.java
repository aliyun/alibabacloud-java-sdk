// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerResponseBody body;

    public static GetEdgeContainerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerResponse self = new GetEdgeContainerResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerResponse setBody(GetEdgeContainerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerResponseBody getBody() {
        return this.body;
    }

}
