// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExecuteScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteScalingRuleResponseBody body;

    public static ExecuteScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScalingRuleResponse self = new ExecuteScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteScalingRuleResponse setBody(ExecuteScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteScalingRuleResponseBody getBody() {
        return this.body;
    }

}
