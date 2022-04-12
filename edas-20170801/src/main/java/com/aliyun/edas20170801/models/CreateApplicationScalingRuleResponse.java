// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateApplicationScalingRuleResponse setBody(CreateApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
