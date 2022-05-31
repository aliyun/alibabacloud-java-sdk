// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAggregateConfigRuleResponseBody body;

    public static UpdateAggregateConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigRuleResponse self = new UpdateAggregateConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregateConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggregateConfigRuleResponse setBody(UpdateAggregateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
