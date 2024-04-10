// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneEncryptionPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePhoneEncryptionPublicKeyResponseBody body;

    public static UpdatePhoneEncryptionPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneEncryptionPublicKeyResponse self = new UpdatePhoneEncryptionPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneEncryptionPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhoneEncryptionPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePhoneEncryptionPublicKeyResponse setBody(UpdatePhoneEncryptionPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhoneEncryptionPublicKeyResponseBody getBody() {
        return this.body;
    }

}
