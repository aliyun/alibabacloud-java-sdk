// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteConsumerAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConsumerAuthorizationRuleResponseBody body;

    public static DeleteConsumerAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerAuthorizationRuleResponse self = new DeleteConsumerAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConsumerAuthorizationRuleResponse setBody(DeleteConsumerAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
