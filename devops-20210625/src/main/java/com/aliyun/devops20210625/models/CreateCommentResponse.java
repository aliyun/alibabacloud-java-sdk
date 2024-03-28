// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCommentResponseBody body;

    public static CreateCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommentResponse self = new CreateCommentResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommentResponse setBody(CreateCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommentResponseBody getBody() {
        return this.body;
    }

}
