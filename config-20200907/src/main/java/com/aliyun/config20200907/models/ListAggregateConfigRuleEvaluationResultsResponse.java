// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateConfigRuleEvaluationResultsResponseBody body;

    public static ListAggregateConfigRuleEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationResultsResponse self = new ListAggregateConfigRuleEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateConfigRuleEvaluationResultsResponse setBody(ListAggregateConfigRuleEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateConfigRuleEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
