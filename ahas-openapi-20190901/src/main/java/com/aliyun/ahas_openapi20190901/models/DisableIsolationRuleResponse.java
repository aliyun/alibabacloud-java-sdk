// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableIsolationRuleResponseBody body;

    public static DisableIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableIsolationRuleResponse self = new DisableIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableIsolationRuleResponse setBody(DisableIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
