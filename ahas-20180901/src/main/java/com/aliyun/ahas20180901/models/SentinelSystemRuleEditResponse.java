// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleEditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleEditResponseBody body;

    public static SentinelSystemRuleEditResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleEditResponse self = new SentinelSystemRuleEditResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleEditResponse setBody(SentinelSystemRuleEditResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleEditResponseBody getBody() {
        return this.body;
    }

}
