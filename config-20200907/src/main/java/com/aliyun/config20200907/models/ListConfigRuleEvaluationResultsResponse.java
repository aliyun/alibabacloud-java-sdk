// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigRuleEvaluationResultsResponseBody body;

    public static ListConfigRuleEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleEvaluationResultsResponse self = new ListConfigRuleEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleEvaluationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigRuleEvaluationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigRuleEvaluationResultsResponse setBody(ListConfigRuleEvaluationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigRuleEvaluationResultsResponseBody getBody() {
        return this.body;
    }

}
