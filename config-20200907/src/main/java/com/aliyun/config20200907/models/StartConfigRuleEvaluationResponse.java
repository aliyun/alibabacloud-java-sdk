// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartConfigRuleEvaluationResponseBody body;

    public static StartConfigRuleEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationResponse self = new StartConfigRuleEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartConfigRuleEvaluationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartConfigRuleEvaluationResponse setBody(StartConfigRuleEvaluationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartConfigRuleEvaluationResponseBody getBody() {
        return this.body;
    }

}
