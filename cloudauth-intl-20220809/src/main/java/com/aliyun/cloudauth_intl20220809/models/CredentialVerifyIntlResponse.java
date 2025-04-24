// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialVerifyIntlResponseBody body;

    public static CredentialVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyIntlResponse self = new CredentialVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialVerifyIntlResponse setBody(CredentialVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
