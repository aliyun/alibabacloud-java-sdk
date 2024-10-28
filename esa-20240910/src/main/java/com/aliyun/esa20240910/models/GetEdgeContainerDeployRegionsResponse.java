// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerDeployRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerDeployRegionsResponseBody body;

    public static GetEdgeContainerDeployRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerDeployRegionsResponse self = new GetEdgeContainerDeployRegionsResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerDeployRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerDeployRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerDeployRegionsResponse setBody(GetEdgeContainerDeployRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerDeployRegionsResponseBody getBody() {
        return this.body;
    }

}
