// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableLayer7CCRuleResponseBody body;

    public static DisableLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCRuleResponse self = new DisableLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLayer7CCRuleResponse setBody(DisableLayer7CCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

}
