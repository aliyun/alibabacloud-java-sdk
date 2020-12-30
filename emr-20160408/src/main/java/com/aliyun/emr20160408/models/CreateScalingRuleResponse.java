// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateScalingRuleResponse setBody(CreateScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScalingRuleResponseBody getBody() {
        return this.body;
    }

}
