// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomerResponseBody body;

    public static CreateCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerResponse self = new CreateCustomerResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomerResponse setBody(CreateCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomerResponseBody getBody() {
        return this.body;
    }

}
