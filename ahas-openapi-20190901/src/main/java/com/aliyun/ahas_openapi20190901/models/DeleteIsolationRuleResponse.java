// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIsolationRuleResponseBody body;

    public static DeleteIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIsolationRuleResponse self = new DeleteIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIsolationRuleResponse setBody(DeleteIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
