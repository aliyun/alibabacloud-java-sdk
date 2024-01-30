// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class VerifyEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyEmailResponseBody body;

    public static VerifyEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyEmailResponse self = new VerifyEmailResponse();
        return TeaModel.build(map, self);
    }

    public VerifyEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyEmailResponse setBody(VerifyEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyEmailResponseBody getBody() {
        return this.body;
    }

}
