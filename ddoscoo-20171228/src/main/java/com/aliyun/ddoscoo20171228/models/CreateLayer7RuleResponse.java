// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer7RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLayer7RuleResponseBody body;

    public static CreateLayer7RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer7RuleResponse self = new CreateLayer7RuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayer7RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLayer7RuleResponse setBody(CreateLayer7RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLayer7RuleResponseBody getBody() {
        return this.body;
    }

}
