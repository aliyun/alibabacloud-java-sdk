// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvironmentResponseBody body;

    public static CreateEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponse self = new CreateEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnvironmentResponse setBody(CreateEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentResponseBody getBody() {
        return this.body;
    }

}
