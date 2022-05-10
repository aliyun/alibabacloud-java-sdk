// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCommentResponseBody body;

    public static SendCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCommentResponse self = new SendCommentResponse();
        return TeaModel.build(map, self);
    }

    public SendCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCommentResponse setBody(SendCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCommentResponseBody getBody() {
        return this.body;
    }

}
