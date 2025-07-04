// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddressVerifyIntlResponseBody body;

    public static AddressVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyIntlResponse self = new AddressVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public AddressVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddressVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddressVerifyIntlResponse setBody(AddressVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public AddressVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
