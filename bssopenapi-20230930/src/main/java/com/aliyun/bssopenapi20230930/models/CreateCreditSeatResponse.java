// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCreditSeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCreditSeatResponseBody body;

    public static CreateCreditSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditSeatResponse self = new CreateCreditSeatResponse();
        return TeaModel.build(map, self);
    }

    public CreateCreditSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCreditSeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCreditSeatResponse setBody(CreateCreditSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCreditSeatResponseBody getBody() {
        return this.body;
    }

}
