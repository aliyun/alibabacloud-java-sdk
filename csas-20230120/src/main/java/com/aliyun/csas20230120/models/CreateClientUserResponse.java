// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateClientUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientUserResponseBody body;

    public static CreateClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientUserResponse self = new CreateClientUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientUserResponse setBody(CreateClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientUserResponseBody getBody() {
        return this.body;
    }

}
