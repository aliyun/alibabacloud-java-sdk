// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
