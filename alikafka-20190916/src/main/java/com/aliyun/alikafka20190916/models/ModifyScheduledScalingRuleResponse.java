// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyScheduledScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScheduledScalingRuleResponseBody body;

    public static ModifyScheduledScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledScalingRuleResponse self = new ModifyScheduledScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScheduledScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScheduledScalingRuleResponse setBody(ModifyScheduledScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScheduledScalingRuleResponseBody getBody() {
        return this.body;
    }

}
