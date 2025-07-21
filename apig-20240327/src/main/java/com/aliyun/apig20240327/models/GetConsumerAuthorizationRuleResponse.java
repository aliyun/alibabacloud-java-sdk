// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerAuthorizationRuleResponseBody body;

    public static GetConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerAuthorizationRuleResponse self = new GetConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerAuthorizationRuleResponse setBody(GetConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
