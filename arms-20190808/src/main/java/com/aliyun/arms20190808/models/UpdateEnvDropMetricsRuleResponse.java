// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvDropMetricsRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvDropMetricsRuleResponseBody body;

    public static UpdateEnvDropMetricsRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvDropMetricsRuleResponse self = new UpdateEnvDropMetricsRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvDropMetricsRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvDropMetricsRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvDropMetricsRuleResponse setBody(UpdateEnvDropMetricsRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvDropMetricsRuleResponseBody getBody() {
        return this.body;
    }

}
