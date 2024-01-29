// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemAllCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkitemAllCommentResponseBody body;

    public static DeleteWorkitemAllCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemAllCommentResponse self = new DeleteWorkitemAllCommentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemAllCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkitemAllCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkitemAllCommentResponse setBody(DeleteWorkitemAllCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkitemAllCommentResponseBody getBody() {
        return this.body;
    }

}
