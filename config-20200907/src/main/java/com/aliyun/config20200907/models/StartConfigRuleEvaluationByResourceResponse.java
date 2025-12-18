// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationByResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartConfigRuleEvaluationByResourceResponseBody body;

    public static StartConfigRuleEvaluationByResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationByResourceResponse self = new StartConfigRuleEvaluationByResourceResponse();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationByResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartConfigRuleEvaluationByResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartConfigRuleEvaluationByResourceResponse setBody(StartConfigRuleEvaluationByResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartConfigRuleEvaluationByResourceResponseBody getBody() {
        return this.body;
    }

}
