// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationScalingRuleResponseBody body;

    public static CreateApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationScalingRuleResponse self = new CreateApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationScalingRuleResponse setBody(CreateApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
