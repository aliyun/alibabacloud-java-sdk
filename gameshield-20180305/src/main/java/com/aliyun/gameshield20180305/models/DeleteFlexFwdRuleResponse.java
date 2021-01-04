// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteFlexFwdRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlexFwdRuleResponseBody body;

    public static DeleteFlexFwdRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlexFwdRuleResponse self = new DeleteFlexFwdRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlexFwdRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlexFwdRuleResponse setBody(DeleteFlexFwdRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlexFwdRuleResponseBody getBody() {
        return this.body;
    }

}
