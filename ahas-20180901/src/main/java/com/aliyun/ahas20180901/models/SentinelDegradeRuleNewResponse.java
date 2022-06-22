// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleNewResponseBody body;

    public static SentinelDegradeRuleNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleNewResponse self = new SentinelDegradeRuleNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleNewResponse setBody(SentinelDegradeRuleNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleNewResponseBody getBody() {
        return this.body;
    }

}
