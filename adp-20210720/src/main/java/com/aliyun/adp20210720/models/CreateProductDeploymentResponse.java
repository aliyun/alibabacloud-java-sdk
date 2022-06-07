// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductDeploymentResponseBody body;

    public static CreateProductDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDeploymentResponse self = new CreateProductDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductDeploymentResponse setBody(CreateProductDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductDeploymentResponseBody getBody() {
        return this.body;
    }

}
