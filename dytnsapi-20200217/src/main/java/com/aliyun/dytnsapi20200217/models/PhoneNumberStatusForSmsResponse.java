// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForSmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberStatusForSmsResponseBody body;

    public static PhoneNumberStatusForSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForSmsResponse self = new PhoneNumberStatusForSmsResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForSmsResponse setBody(PhoneNumberStatusForSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForSmsResponseBody getBody() {
        return this.body;
    }

}
