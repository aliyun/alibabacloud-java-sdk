// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAutoScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoScalingRuleResponseBody body;

    public static CreateAutoScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingRuleResponse self = new CreateAutoScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoScalingRuleResponse setBody(CreateAutoScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoScalingRuleResponseBody getBody() {
        return this.body;
    }

}
