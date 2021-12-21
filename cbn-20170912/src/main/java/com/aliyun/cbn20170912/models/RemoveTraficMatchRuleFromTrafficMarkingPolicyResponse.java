// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body;

    public static RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse self = new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse setBody(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
