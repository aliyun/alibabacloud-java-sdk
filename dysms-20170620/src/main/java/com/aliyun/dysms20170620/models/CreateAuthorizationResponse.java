// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAuthorizationResponseBody body;

    public static CreateAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResponse self = new CreateAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationResponse setBody(CreateAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationResponseBody getBody() {
        return this.body;
    }

}
