// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhoneEncryptionPublicKeyResponseBody body;

    public static GetPhoneEncryptionPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneEncryptionPublicKeyResponse self = new GetPhoneEncryptionPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneEncryptionPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneEncryptionPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhoneEncryptionPublicKeyResponse setBody(GetPhoneEncryptionPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneEncryptionPublicKeyResponseBody getBody() {
        return this.body;
    }

}
