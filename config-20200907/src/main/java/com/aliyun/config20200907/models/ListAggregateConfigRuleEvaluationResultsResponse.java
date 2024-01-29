// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAggregateConfigRuleEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateConfigRuleEvaluationResultsResponse setBody(ListAggregateConfigRuleEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateConfigRuleEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
