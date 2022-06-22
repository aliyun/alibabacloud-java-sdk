// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleDeleteResponseBody body;

    public static SentinelWebFlowRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleDeleteResponse self = new SentinelWebFlowRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleDeleteResponse setBody(SentinelWebFlowRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
