// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class BanCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BanCommentResponseBody body;

    public static BanCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        BanCommentResponse self = new BanCommentResponse();
        return TeaModel.build(map, self);
    }

    public BanCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BanCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BanCommentResponse setBody(BanCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public BanCommentResponseBody getBody() {
        return this.body;
    }

}
