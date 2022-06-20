// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEdgeInstanceDeploymentResponseBody body;

    public static CreateEdgeInstanceDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceDeploymentResponse self = new CreateEdgeInstanceDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeInstanceDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeInstanceDeploymentResponse setBody(CreateEdgeInstanceDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

}
