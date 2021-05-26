// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateChatDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChatDispatchRuleResponseBody body;

    public static CreateChatDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatDispatchRuleResponse self = new CreateChatDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatDispatchRuleResponse setBody(CreateChatDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
