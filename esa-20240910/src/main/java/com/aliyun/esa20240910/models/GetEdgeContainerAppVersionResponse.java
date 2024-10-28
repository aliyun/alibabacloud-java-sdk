// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppVersionResponseBody body;

    public static GetEdgeContainerAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppVersionResponse self = new GetEdgeContainerAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppVersionResponse setBody(GetEdgeContainerAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppVersionResponseBody getBody() {
        return this.body;
    }

}
