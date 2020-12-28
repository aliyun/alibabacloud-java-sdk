// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableIsolationRuleResponseBody body;

    public static EnableIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIsolationRuleResponse self = new EnableIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIsolationRuleResponse setBody(EnableIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
