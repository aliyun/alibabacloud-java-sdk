// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelBanAllCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelBanAllCommentResponseBody body;

    public static CancelBanAllCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBanAllCommentResponse self = new CancelBanAllCommentResponse();
        return TeaModel.build(map, self);
    }

    public CancelBanAllCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelBanAllCommentResponse setBody(CancelBanAllCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelBanAllCommentResponseBody getBody() {
        return this.body;
    }

}
