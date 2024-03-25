// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTrafficMatchRuleToTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body;

    public static AddTrafficMatchRuleToTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficMatchRuleToTrafficMarkingPolicyResponse self = new AddTrafficMatchRuleToTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyResponse setBody(AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
