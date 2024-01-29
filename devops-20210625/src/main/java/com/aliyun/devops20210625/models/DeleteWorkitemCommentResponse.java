// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkitemCommentResponseBody body;

    public static DeleteWorkitemCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemCommentResponse self = new DeleteWorkitemCommentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkitemCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkitemCommentResponse setBody(DeleteWorkitemCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkitemCommentResponseBody getBody() {
        return this.body;
    }

}
