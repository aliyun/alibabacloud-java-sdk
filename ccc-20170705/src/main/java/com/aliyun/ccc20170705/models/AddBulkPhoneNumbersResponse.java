// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddBulkPhoneNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBulkPhoneNumbersResponseBody body;

    public static AddBulkPhoneNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBulkPhoneNumbersResponse self = new AddBulkPhoneNumbersResponse();
        return TeaModel.build(map, self);
    }

    public AddBulkPhoneNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBulkPhoneNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBulkPhoneNumbersResponse setBody(AddBulkPhoneNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBulkPhoneNumbersResponseBody getBody() {
        return this.body;
    }

}
