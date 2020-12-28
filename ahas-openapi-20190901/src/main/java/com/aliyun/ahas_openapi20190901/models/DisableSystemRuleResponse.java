// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableSystemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSystemRuleResponseBody body;

    public static DisableSystemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSystemRuleResponse self = new DisableSystemRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableSystemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSystemRuleResponse setBody(DisableSystemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSystemRuleResponseBody getBody() {
        return this.body;
    }

}
