// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAggregateConfigRuleResponseBody body;

    public static CreateAggregateConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigRuleResponse self = new CreateAggregateConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregateConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregateConfigRuleResponse setBody(CreateAggregateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
