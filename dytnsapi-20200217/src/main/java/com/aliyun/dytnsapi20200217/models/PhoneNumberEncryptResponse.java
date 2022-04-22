// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberEncryptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PhoneNumberEncryptResponse setBody(PhoneNumberEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberEncryptResponseBody getBody() {
        return this.body;
    }

}
