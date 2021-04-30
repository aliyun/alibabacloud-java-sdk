// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRuleResponseBody body;

    public static DeleteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleResponse self = new DeleteRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRuleResponse setBody(DeleteRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRuleResponseBody getBody() {
        return this.body;
    }

}
