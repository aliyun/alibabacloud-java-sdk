// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDegradeRuleResponseBody body;

    public static CreateDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDegradeRuleResponse self = new CreateDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDegradeRuleResponse setBody(CreateDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
