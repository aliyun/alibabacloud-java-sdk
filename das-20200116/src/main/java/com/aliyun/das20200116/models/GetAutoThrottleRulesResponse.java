// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoThrottleRulesResponseBody body;

    public static GetAutoThrottleRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoThrottleRulesResponse self = new GetAutoThrottleRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoThrottleRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoThrottleRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoThrottleRulesResponse setBody(GetAutoThrottleRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoThrottleRulesResponseBody getBody() {
        return this.body;
    }

}
