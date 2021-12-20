// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupAuthorizationRuleResponseBody body;

    public static CreateGroupAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAuthorizationRuleResponse self = new CreateGroupAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupAuthorizationRuleResponse setBody(CreateGroupAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
