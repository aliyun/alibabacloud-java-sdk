// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateScheduledScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduledScalingRuleResponseBody body;

    public static CreateScheduledScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledScalingRuleResponse self = new CreateScheduledScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduledScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduledScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduledScalingRuleResponse setBody(CreateScheduledScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduledScalingRuleResponseBody getBody() {
        return this.body;
    }

}
