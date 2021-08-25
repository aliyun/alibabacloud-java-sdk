// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAggregateConfigRuleEvaluationResponseBody body;

    public static StartAggregateConfigRuleEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateConfigRuleEvaluationResponse self = new StartAggregateConfigRuleEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public StartAggregateConfigRuleEvaluationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAggregateConfigRuleEvaluationResponse setBody(StartAggregateConfigRuleEvaluationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAggregateConfigRuleEvaluationResponseBody getBody() {
        return this.body;
    }

}
