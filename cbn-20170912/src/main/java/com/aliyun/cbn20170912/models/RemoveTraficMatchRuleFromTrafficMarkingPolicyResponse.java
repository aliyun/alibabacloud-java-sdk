// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse setBody(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
