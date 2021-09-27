// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetProductDeploymentResponse setBody(GetProductDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductDeploymentResponseBody getBody() {
        return this.body;
    }

}
