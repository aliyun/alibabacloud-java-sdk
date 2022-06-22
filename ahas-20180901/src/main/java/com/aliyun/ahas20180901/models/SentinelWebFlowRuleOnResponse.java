// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleOnResponseBody body;

    public static SentinelWebFlowRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOnResponse self = new SentinelWebFlowRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleOnResponse setBody(SentinelWebFlowRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleOnResponseBody getBody() {
        return this.body;
    }

}
