// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScalingRuleResponseBody body;

    public static ModifyScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleResponse self = new ModifyScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScalingRuleResponse setBody(ModifyScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingRuleResponseBody getBody() {
        return this.body;
    }

}
