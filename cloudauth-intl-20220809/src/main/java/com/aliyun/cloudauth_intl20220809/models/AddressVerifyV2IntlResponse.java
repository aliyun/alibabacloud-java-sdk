// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyV2IntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddressVerifyV2IntlResponseBody body;

    public static AddressVerifyV2IntlResponse build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyV2IntlResponse self = new AddressVerifyV2IntlResponse();
        return TeaModel.build(map, self);
    }

    public AddressVerifyV2IntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddressVerifyV2IntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddressVerifyV2IntlResponse setBody(AddressVerifyV2IntlResponseBody body) {
        this.body = body;
        return this;
    }
    public AddressVerifyV2IntlResponseBody getBody() {
        return this.body;
    }

}
