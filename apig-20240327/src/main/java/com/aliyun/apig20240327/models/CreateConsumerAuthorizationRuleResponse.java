// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsumerAuthorizationRuleResponseBody body;

    public static CreateConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRuleResponse self = new CreateConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerAuthorizationRuleResponse setBody(CreateConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
