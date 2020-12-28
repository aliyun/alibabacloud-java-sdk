// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowRuleResponseBody body;

    public static CreateFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRuleResponse self = new CreateFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowRuleResponse setBody(CreateFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowRuleResponseBody getBody() {
        return this.body;
    }

}
