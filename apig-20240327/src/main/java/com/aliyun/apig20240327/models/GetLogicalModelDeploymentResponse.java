// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetLogicalModelDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogicalModelDeploymentResponseBody body;

    public static GetLogicalModelDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogicalModelDeploymentResponse self = new GetLogicalModelDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetLogicalModelDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogicalModelDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogicalModelDeploymentResponse setBody(GetLogicalModelDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogicalModelDeploymentResponseBody getBody() {
        return this.body;
    }

}
