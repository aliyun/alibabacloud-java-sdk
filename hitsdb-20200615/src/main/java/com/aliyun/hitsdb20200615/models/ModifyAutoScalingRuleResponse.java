// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoScalingRuleResponseBody body;

    public static ModifyAutoScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoScalingRuleResponse self = new ModifyAutoScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoScalingRuleResponse setBody(ModifyAutoScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoScalingRuleResponseBody getBody() {
        return this.body;
    }

}
