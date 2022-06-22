// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleDeleteResponseBody body;

    public static SentinelFlowRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleDeleteResponse self = new SentinelFlowRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleDeleteResponse setBody(SentinelFlowRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
