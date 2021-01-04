// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeletePortRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePortRuleResponseBody body;

    public static DeletePortRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePortRuleResponse self = new DeletePortRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePortRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePortRuleResponse setBody(DeletePortRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePortRuleResponseBody getBody() {
        return this.body;
    }

}
