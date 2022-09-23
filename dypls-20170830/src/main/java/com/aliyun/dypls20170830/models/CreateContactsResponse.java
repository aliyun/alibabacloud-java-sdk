// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateContactsResponseBody body;

    public static CreateContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContactsResponse self = new CreateContactsResponse();
        return TeaModel.build(map, self);
    }

    public CreateContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContactsResponse setBody(CreateContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContactsResponseBody getBody() {
        return this.body;
    }

}
