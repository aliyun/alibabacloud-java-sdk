// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableHotParamRuleResponseBody body;

    public static EnableHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHotParamRuleResponse self = new EnableHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHotParamRuleResponse setBody(EnableHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
