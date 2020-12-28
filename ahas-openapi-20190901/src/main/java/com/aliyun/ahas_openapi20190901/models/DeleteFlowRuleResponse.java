// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowRuleResponseBody body;

    public static DeleteFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRuleResponse self = new DeleteFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowRuleResponse setBody(DeleteFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowRuleResponseBody getBody() {
        return this.body;
    }

}
