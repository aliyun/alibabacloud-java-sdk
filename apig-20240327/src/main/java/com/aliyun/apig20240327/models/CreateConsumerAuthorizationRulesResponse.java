// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsumerAuthorizationRulesResponseBody body;

    public static CreateConsumerAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRulesResponse self = new CreateConsumerAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerAuthorizationRulesResponse setBody(CreateConsumerAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
