// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class DeleteFlowItemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowItemRuleResponseBody body;

    public static DeleteFlowItemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowItemRuleResponse self = new DeleteFlowItemRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowItemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowItemRuleResponse setBody(DeleteFlowItemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowItemRuleResponseBody getBody() {
        return this.body;
    }

}
