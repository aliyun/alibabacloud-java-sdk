// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class BanAllCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BanAllCommentResponseBody body;

    public static BanAllCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        BanAllCommentResponse self = new BanAllCommentResponse();
        return TeaModel.build(map, self);
    }

    public BanAllCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BanAllCommentResponse setBody(BanAllCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public BanAllCommentResponseBody getBody() {
        return this.body;
    }

}
