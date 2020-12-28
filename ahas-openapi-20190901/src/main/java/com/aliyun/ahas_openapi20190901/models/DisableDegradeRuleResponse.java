// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDegradeRuleResponseBody body;

    public static DisableDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDegradeRuleResponse self = new DisableDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDegradeRuleResponse setBody(DisableDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
