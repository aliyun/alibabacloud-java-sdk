// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody body;

    public static ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse self = new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse setBody(ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
