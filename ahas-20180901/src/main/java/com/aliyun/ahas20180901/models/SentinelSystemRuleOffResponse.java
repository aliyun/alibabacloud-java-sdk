// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleOffResponseBody body;

    public static SentinelSystemRuleOffResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOffResponse self = new SentinelSystemRuleOffResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleOffResponse setBody(SentinelSystemRuleOffResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleOffResponseBody getBody() {
        return this.body;
    }

}
