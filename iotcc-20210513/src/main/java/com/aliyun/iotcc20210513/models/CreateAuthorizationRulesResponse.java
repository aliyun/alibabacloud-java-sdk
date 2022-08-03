// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthorizationRulesResponseBody body;

    public static CreateAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRulesResponse self = new CreateAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationRulesResponse setBody(CreateAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
