// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleEditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleEditResponseBody body;

    public static SentinelDegradeRuleEditResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleEditResponse self = new SentinelDegradeRuleEditResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleEditResponse setBody(SentinelDegradeRuleEditResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleEditResponseBody getBody() {
        return this.body;
    }

}
