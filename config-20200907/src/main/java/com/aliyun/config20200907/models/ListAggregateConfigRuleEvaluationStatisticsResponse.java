// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateConfigRuleEvaluationStatisticsResponseBody body;

    public static ListAggregateConfigRuleEvaluationStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationStatisticsResponse self = new ListAggregateConfigRuleEvaluationStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateConfigRuleEvaluationStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateConfigRuleEvaluationStatisticsResponse setBody(ListAggregateConfigRuleEvaluationStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateConfigRuleEvaluationStatisticsResponseBody getBody() {
        return this.body;
    }

}
