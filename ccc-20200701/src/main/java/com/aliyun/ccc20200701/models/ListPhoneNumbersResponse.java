// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPhoneNumbersResponseBody body;

    public static ListPhoneNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersResponse self = new ListPhoneNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhoneNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPhoneNumbersResponse setBody(ListPhoneNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneNumbersResponseBody getBody() {
        return this.body;
    }

}
