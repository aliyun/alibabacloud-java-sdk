// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthorizationRuleResponseBody body;

    public static CreateAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleResponse self = new CreateAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationRuleResponse setBody(CreateAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
