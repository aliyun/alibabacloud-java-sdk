// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContactResponseBody body;

    public static CreateContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContactResponse self = new CreateContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContactResponse setBody(CreateContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContactResponseBody getBody() {
        return this.body;
    }

}
