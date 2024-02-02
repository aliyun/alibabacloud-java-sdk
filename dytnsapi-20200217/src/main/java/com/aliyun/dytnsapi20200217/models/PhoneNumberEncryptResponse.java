// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberEncryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberEncryptResponseBody body;

    public static PhoneNumberEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberEncryptResponse self = new PhoneNumberEncryptResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberEncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberEncryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberEncryptResponse setBody(PhoneNumberEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberEncryptResponseBody getBody() {
        return this.body;
    }

}
