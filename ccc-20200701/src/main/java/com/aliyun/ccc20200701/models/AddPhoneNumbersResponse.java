// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPhoneNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPhoneNumbersResponseBody body;

    public static AddPhoneNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumbersResponse self = new AddPhoneNumbersResponse();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPhoneNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPhoneNumbersResponse setBody(AddPhoneNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPhoneNumbersResponseBody getBody() {
        return this.body;
    }

}
