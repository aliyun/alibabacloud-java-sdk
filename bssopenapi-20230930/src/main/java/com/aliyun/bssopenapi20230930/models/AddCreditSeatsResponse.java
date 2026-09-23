// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCreditSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCreditSeatsResponseBody body;

    public static AddCreditSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCreditSeatsResponse self = new AddCreditSeatsResponse();
        return TeaModel.build(map, self);
    }

    public AddCreditSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCreditSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCreditSeatsResponse setBody(AddCreditSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCreditSeatsResponseBody getBody() {
        return this.body;
    }

}
