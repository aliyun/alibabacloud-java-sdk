// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteFlexAccFwdRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlexAccFwdRuleResponseBody body;

    public static DeleteFlexAccFwdRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlexAccFwdRuleResponse self = new DeleteFlexAccFwdRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlexAccFwdRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlexAccFwdRuleResponse setBody(DeleteFlexAccFwdRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlexAccFwdRuleResponseBody getBody() {
        return this.body;
    }

}
