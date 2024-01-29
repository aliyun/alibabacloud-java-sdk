// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkitemCommentResponseBody body;

    public static CreateWorkitemCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemCommentResponse self = new CreateWorkitemCommentResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkitemCommentResponse setBody(CreateWorkitemCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemCommentResponseBody getBody() {
        return this.body;
    }

}
