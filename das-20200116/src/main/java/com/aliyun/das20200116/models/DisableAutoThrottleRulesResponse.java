// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoThrottleRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAutoThrottleRulesResponseBody body;

    public static DisableAutoThrottleRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoThrottleRulesResponse self = new DisableAutoThrottleRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableAutoThrottleRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAutoThrottleRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAutoThrottleRulesResponse setBody(DisableAutoThrottleRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAutoThrottleRulesResponseBody getBody() {
        return this.body;
    }

}
