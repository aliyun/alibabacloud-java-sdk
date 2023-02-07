// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EncryptPhoneNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EncryptPhoneNumResponseBody body;

    public static EncryptPhoneNumResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptPhoneNumResponse self = new EncryptPhoneNumResponse();
        return TeaModel.build(map, self);
    }

    public EncryptPhoneNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncryptPhoneNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EncryptPhoneNumResponse setBody(EncryptPhoneNumResponseBody body) {
        this.body = body;
        return this;
    }
    public EncryptPhoneNumResponseBody getBody() {
        return this.body;
    }

}
