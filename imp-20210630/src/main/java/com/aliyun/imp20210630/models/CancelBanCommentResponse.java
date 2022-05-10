// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelBanCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelBanCommentResponseBody body;

    public static CancelBanCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBanCommentResponse self = new CancelBanCommentResponse();
        return TeaModel.build(map, self);
    }

    public CancelBanCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelBanCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelBanCommentResponse setBody(CancelBanCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelBanCommentResponseBody getBody() {
        return this.body;
    }

}
