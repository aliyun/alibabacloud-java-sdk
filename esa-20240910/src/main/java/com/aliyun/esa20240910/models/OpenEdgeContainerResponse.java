// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class OpenEdgeContainerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenEdgeContainerResponseBody body;

    public static OpenEdgeContainerResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenEdgeContainerResponse self = new OpenEdgeContainerResponse();
        return TeaModel.build(map, self);
    }

    public OpenEdgeContainerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenEdgeContainerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenEdgeContainerResponse setBody(OpenEdgeContainerResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenEdgeContainerResponseBody getBody() {
        return this.body;
    }

}
