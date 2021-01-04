// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreatePortRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePortRuleResponseBody body;

    public static CreatePortRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRuleResponse self = new CreatePortRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortRuleResponse setBody(CreatePortRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortRuleResponseBody getBody() {
        return this.body;
    }

}
