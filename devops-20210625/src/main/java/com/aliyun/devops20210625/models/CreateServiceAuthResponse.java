// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceAuthResponseBody body;

    public static CreateServiceAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAuthResponse self = new CreateServiceAuthResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceAuthResponse setBody(CreateServiceAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceAuthResponseBody getBody() {
        return this.body;
    }

}
