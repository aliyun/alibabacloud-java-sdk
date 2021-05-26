// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteChatDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChatDispatchRuleResponseBody body;

    public static DeleteChatDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatDispatchRuleResponse self = new DeleteChatDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatDispatchRuleResponse setBody(DeleteChatDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
