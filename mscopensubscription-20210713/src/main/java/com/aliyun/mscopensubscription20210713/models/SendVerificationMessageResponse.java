// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class SendVerificationMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendVerificationMessageResponseBody body;

    public static SendVerificationMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationMessageResponse self = new SendVerificationMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerificationMessageResponse setBody(SendVerificationMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationMessageResponseBody getBody() {
        return this.body;
    }

}
