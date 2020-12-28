// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableFlowRuleResponseBody body;

    public static DisableFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowRuleResponse self = new DisableFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFlowRuleResponse setBody(DisableFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFlowRuleResponseBody getBody() {
        return this.body;
    }

}
