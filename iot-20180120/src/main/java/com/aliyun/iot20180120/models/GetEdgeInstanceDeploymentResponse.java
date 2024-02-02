// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeInstanceDeploymentResponseBody body;

    public static GetEdgeInstanceDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceDeploymentResponse self = new GetEdgeInstanceDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeInstanceDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeInstanceDeploymentResponse setBody(GetEdgeInstanceDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

}
