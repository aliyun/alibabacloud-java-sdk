// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePhoneNumbersResponseBody body;

    public static RemovePhoneNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumbersResponse self = new RemovePhoneNumbersResponse();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePhoneNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePhoneNumbersResponse setBody(RemovePhoneNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumbersResponseBody getBody() {
        return this.body;
    }

}
