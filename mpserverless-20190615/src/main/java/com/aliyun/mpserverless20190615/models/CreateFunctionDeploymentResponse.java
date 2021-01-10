// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateFunctionDeploymentResponse setBody(CreateFunctionDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

}
