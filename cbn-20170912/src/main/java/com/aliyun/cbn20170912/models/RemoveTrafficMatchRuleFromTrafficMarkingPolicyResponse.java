// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body;

    public static RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse self = new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse setBody(RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
