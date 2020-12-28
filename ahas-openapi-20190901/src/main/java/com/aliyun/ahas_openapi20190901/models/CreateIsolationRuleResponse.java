// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIsolationRuleResponseBody body;

    public static CreateIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIsolationRuleResponse self = new CreateIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIsolationRuleResponse setBody(CreateIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
