// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PhoneNumberStatusForPublicResponseBody body;

    public static PhoneNumberStatusForPublicResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForPublicResponse self = new PhoneNumberStatusForPublicResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForPublicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForPublicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForPublicResponse setBody(PhoneNumberStatusForPublicResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForPublicResponseBody getBody() {
        return this.body;
    }

}
