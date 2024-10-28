// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppResponseBody body;

    public static GetEdgeContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResponse self = new GetEdgeContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppResponse setBody(GetEdgeContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppResponseBody getBody() {
        return this.body;
    }

}
