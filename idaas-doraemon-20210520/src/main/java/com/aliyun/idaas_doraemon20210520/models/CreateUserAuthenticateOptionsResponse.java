// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateUserAuthenticateOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserAuthenticateOptionsResponseBody body;

    public static CreateUserAuthenticateOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthenticateOptionsResponse self = new CreateUserAuthenticateOptionsResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthenticateOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserAuthenticateOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserAuthenticateOptionsResponse setBody(CreateUserAuthenticateOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserAuthenticateOptionsResponseBody getBody() {
        return this.body;
    }

}
