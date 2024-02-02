// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CloseEdgeInstanceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseEdgeInstanceDeploymentResponseBody body;

    public static CloseEdgeInstanceDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseEdgeInstanceDeploymentResponse self = new CloseEdgeInstanceDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CloseEdgeInstanceDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseEdgeInstanceDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseEdgeInstanceDeploymentResponse setBody(CloseEdgeInstanceDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseEdgeInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

}
