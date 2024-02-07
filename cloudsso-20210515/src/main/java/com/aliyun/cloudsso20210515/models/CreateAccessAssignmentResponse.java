// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessAssignmentResponseBody body;

    public static CreateAccessAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessAssignmentResponse self = new CreateAccessAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessAssignmentResponse setBody(CreateAccessAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessAssignmentResponseBody getBody() {
        return this.body;
    }

}
