// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDispatchRuleResponseBody body;

    public static CreateDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDispatchRuleResponse self = new CreateDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDispatchRuleResponse setBody(CreateDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
