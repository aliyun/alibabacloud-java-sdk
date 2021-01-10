// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRuleActionResponseBody body;

    public static CreateRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleActionResponse self = new CreateRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRuleActionResponse setBody(CreateRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRuleActionResponseBody getBody() {
        return this.body;
    }

}
