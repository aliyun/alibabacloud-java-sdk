// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleListAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelWebFlowRuleListAllResponseBody body;

    public static SentinelWebFlowRuleListAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleListAllResponse self = new SentinelWebFlowRuleListAllResponse();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleListAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelWebFlowRuleListAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelWebFlowRuleListAllResponse setBody(SentinelWebFlowRuleListAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelWebFlowRuleListAllResponseBody getBody() {
        return this.body;
    }

}
