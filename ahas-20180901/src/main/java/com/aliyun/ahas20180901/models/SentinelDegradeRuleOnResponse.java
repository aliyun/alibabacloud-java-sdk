// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleOnResponseBody body;

    public static SentinelDegradeRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOnResponse self = new SentinelDegradeRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleOnResponse setBody(SentinelDegradeRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleOnResponseBody getBody() {
        return this.body;
    }

}
