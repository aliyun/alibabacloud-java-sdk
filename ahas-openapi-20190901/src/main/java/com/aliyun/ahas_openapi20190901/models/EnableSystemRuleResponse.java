// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableSystemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSystemRuleResponseBody body;

    public static EnableSystemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSystemRuleResponse self = new EnableSystemRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableSystemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSystemRuleResponse setBody(EnableSystemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSystemRuleResponseBody getBody() {
        return this.body;
    }

}
