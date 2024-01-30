// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class EmailVerifiedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EmailVerifiedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EmailVerifiedResponse setBody(EmailVerifiedResponseBody body) {
        this.body = body;
        return this;
    }
    public EmailVerifiedResponseBody getBody() {
        return this.body;
    }

}
