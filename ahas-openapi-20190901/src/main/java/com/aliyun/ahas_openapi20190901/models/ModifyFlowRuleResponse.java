// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowRuleResponseBody body;

    public static ModifyFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRuleResponse self = new ModifyFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowRuleResponse setBody(ModifyFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowRuleResponseBody getBody() {
        return this.body;
    }

}
