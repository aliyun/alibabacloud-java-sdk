// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppResourceCapacityResponseBody body;

    public static GetEdgeContainerAppResourceCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceCapacityResponse self = new GetEdgeContainerAppResourceCapacityResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppResourceCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppResourceCapacityResponse setBody(GetEdgeContainerAppResourceCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppResourceCapacityResponseBody getBody() {
        return this.body;
    }

}
