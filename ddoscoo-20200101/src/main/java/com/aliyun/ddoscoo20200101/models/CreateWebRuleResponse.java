// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWebRuleResponseBody body;

    public static CreateWebRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebRuleResponse self = new CreateWebRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebRuleResponse setBody(CreateWebRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebRuleResponseBody getBody() {
        return this.body;
    }

}
