// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateSystemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSystemRuleResponseBody body;

    public static CreateSystemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemRuleResponse self = new CreateSystemRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSystemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSystemRuleResponse setBody(CreateSystemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSystemRuleResponseBody getBody() {
        return this.body;
    }

}
