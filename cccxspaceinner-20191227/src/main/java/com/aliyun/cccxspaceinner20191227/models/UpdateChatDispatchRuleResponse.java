// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateChatDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateChatDispatchRuleResponseBody body;

    public static UpdateChatDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatDispatchRuleResponse self = new UpdateChatDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatDispatchRuleResponse setBody(UpdateChatDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
