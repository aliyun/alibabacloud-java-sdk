// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class CreateClientRuleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientRuleStrategyResponseBody body;

    public static CreateClientRuleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientRuleStrategyResponse self = new CreateClientRuleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientRuleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientRuleStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientRuleStrategyResponse setBody(CreateClientRuleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientRuleStrategyResponseBody getBody() {
        return this.body;
    }

}
