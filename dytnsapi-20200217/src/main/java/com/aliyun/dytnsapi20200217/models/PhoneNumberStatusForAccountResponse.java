// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberStatusForAccountResponseBody body;

    public static PhoneNumberStatusForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForAccountResponse self = new PhoneNumberStatusForAccountResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForAccountResponse setBody(PhoneNumberStatusForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForAccountResponseBody getBody() {
        return this.body;
    }

}
