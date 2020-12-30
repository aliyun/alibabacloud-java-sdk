// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class EmailVerifiedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EmailVerifiedResponseBody body;

    public static EmailVerifiedResponse build(java.util.Map<String, ?> map) throws Exception {
        EmailVerifiedResponse self = new EmailVerifiedResponse();
        return TeaModel.build(map, self);
    }

    public EmailVerifiedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EmailVerifiedResponse setBody(EmailVerifiedResponseBody body) {
        this.body = body;
        return this;
    }
    public EmailVerifiedResponseBody getBody() {
        return this.body;
    }

}
