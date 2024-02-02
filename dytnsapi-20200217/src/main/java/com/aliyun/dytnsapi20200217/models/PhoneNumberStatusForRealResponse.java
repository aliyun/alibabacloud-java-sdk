// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForRealResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberStatusForRealResponseBody body;

    public static PhoneNumberStatusForRealResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForRealResponse self = new PhoneNumberStatusForRealResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForRealResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForRealResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForRealResponse setBody(PhoneNumberStatusForRealResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForRealResponseBody getBody() {
        return this.body;
    }

}
