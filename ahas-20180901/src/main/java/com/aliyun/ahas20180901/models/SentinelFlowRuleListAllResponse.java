// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFlowRuleListAllResponseBody body;

    public static SentinelFlowRuleListAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListAllResponse self = new SentinelFlowRuleListAllResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFlowRuleListAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFlowRuleListAllResponse setBody(SentinelFlowRuleListAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFlowRuleListAllResponseBody getBody() {
        return this.body;
    }

}
