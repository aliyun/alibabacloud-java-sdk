// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentByCreatorIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommentByCreatorIdResponseBody body;

    public static DeleteCommentByCreatorIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentByCreatorIdResponse self = new DeleteCommentByCreatorIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommentByCreatorIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommentByCreatorIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCommentByCreatorIdResponse setBody(DeleteCommentByCreatorIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommentByCreatorIdResponseBody getBody() {
        return this.body;
    }

}
