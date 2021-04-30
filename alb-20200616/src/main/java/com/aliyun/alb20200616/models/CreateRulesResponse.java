// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRulesResponseBody body;

    public static CreateRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesResponse self = new CreateRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRulesResponse setBody(CreateRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRulesResponseBody getBody() {
        return this.body;
    }

}
