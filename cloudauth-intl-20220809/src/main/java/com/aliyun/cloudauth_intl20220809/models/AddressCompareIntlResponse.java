// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressCompareIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddressCompareIntlResponseBody body;

    public static AddressCompareIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        AddressCompareIntlResponse self = new AddressCompareIntlResponse();
        return TeaModel.build(map, self);
    }

    public AddressCompareIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddressCompareIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddressCompareIntlResponse setBody(AddressCompareIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public AddressCompareIntlResponseBody getBody() {
        return this.body;
    }

}
