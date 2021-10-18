// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommentResponseBody body;

    public static DeleteCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentResponse self = new DeleteCommentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommentResponse setBody(DeleteCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommentResponseBody getBody() {
        return this.body;
    }

}
