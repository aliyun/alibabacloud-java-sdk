// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialGetResultIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialGetResultIntlResponseBody body;

    public static CredentialGetResultIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        CredentialGetResultIntlResponse self = new CredentialGetResultIntlResponse();
        return TeaModel.build(map, self);
    }

    public CredentialGetResultIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialGetResultIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialGetResultIntlResponse setBody(CredentialGetResultIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialGetResultIntlResponseBody getBody() {
        return this.body;
    }

}
