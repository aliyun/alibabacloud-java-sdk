// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTraficMatchRuleToTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body;

    public static AddTraficMatchRuleToTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTraficMatchRuleToTrafficMarkingPolicyResponse self = new AddTraficMatchRuleToTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse setBody(AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
