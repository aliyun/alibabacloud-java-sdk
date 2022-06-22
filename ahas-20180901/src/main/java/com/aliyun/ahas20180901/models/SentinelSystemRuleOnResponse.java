// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleOnResponseBody body;

    public static SentinelSystemRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOnResponse self = new SentinelSystemRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleOnResponse setBody(SentinelSystemRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleOnResponseBody getBody() {
        return this.body;
    }

}
