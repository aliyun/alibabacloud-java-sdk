// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAccessAssignmentResponse setBody(CreateAccessAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessAssignmentResponseBody getBody() {
        return this.body;
    }

}
