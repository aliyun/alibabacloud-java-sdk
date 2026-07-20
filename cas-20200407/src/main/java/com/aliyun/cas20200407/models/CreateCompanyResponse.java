// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCompanyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCompanyResponseBody body;

    public static CreateCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCompanyResponse self = new CreateCompanyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCompanyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCompanyResponse setBody(CreateCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCompanyResponseBody getBody() {
        return this.body;
    }

}
