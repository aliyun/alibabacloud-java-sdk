// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFunctionDeploymentResponseBody body;

    public static CreateFunctionDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionDeploymentResponse self = new CreateFunctionDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionDeploymentResponse setBody(CreateFunctionDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

}
