// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleListByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleListByPageResponseBody body;

    public static SentinelWebFlowRuleListByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleListByPageResponse self = new SentinelWebFlowRuleListByPageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleListByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleListByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleListByPageResponse setBody(SentinelWebFlowRuleListByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleListByPageResponseBody getBody() {
        return this.body;
    }

}
