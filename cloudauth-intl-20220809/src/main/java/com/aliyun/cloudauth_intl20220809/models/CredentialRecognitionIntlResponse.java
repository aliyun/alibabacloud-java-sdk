// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialRecognitionIntlResponseBody body;

    public static CredentialRecognitionIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlResponse self = new CredentialRecognitionIntlResponse();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialRecognitionIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialRecognitionIntlResponse setBody(CredentialRecognitionIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialRecognitionIntlResponseBody getBody() {
        return this.body;
    }

}
