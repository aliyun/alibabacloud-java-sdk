// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScalingRuleResponseBody body;

    public static CreateScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleResponse self = new CreateScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScalingRuleResponse setBody(CreateScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingRuleResponseBody getBody() {
        return this.body;
    }

}
