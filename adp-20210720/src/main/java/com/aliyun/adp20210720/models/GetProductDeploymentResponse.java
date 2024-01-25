// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductDeploymentResponseBody body;

    public static GetProductDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductDeploymentResponse self = new GetProductDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetProductDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductDeploymentResponse setBody(GetProductDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductDeploymentResponseBody getBody() {
        return this.body;
    }

}
