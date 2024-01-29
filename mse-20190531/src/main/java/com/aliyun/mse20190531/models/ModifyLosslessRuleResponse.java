// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLosslessRuleResponseBody body;

    public static ModifyLosslessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLosslessRuleResponse self = new ModifyLosslessRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLosslessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLosslessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLosslessRuleResponse setBody(ModifyLosslessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLosslessRuleResponseBody getBody() {
        return this.body;
    }

}
