// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineCodeDeploymentResponseBody body;

    public static CreateRoutineCodeDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineCodeDeploymentResponse self = new CreateRoutineCodeDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineCodeDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineCodeDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineCodeDeploymentResponse setBody(CreateRoutineCodeDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineCodeDeploymentResponseBody getBody() {
        return this.body;
    }

}
