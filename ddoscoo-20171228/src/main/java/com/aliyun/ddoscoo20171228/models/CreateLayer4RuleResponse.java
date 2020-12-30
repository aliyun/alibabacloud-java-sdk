// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLayer4RuleResponseBody body;

    public static CreateLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleResponse self = new CreateLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLayer4RuleResponse setBody(CreateLayer4RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLayer4RuleResponseBody getBody() {
        return this.body;
    }

}
