// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterEventSourceResponseBody body;

    public static RegisterEventSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterEventSourceResponse self = new RegisterEventSourceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterEventSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterEventSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterEventSourceResponse setBody(RegisterEventSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterEventSourceResponseBody getBody() {
        return this.body;
    }

}
