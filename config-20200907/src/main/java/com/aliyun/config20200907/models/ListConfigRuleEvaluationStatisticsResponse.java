// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigRuleEvaluationStatisticsResponseBody body;

    public static ListConfigRuleEvaluationStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleEvaluationStatisticsResponse self = new ListConfigRuleEvaluationStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleEvaluationStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigRuleEvaluationStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigRuleEvaluationStatisticsResponse setBody(ListConfigRuleEvaluationStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigRuleEvaluationStatisticsResponseBody getBody() {
        return this.body;
    }

}
