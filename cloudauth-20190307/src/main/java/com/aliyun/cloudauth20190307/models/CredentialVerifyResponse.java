// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialVerifyResponseBody body;

    public static CredentialVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyResponse self = new CredentialVerifyResponse();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialVerifyResponse setBody(CredentialVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialVerifyResponseBody getBody() {
        return this.body;
    }

}
