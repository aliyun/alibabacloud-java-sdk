// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SendVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendVerificationResponseBody body;

    public static SendVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationResponse self = new SendVerificationResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationResponse setBody(SendVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationResponseBody getBody() {
        return this.body;
    }

}
