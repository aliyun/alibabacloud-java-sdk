// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTraficMatchRuleToTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse setBody(AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
