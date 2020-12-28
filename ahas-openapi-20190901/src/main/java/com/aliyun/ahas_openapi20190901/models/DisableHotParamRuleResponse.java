// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableHotParamRuleResponseBody body;

    public static DisableHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableHotParamRuleResponse self = new DisableHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableHotParamRuleResponse setBody(DisableHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
