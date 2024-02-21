// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoResourceOptimizeRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAutoResourceOptimizeRulesResponseBody body;

    public static DisableAutoResourceOptimizeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoResourceOptimizeRulesResponse self = new DisableAutoResourceOptimizeRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableAutoResourceOptimizeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAutoResourceOptimizeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAutoResourceOptimizeRulesResponse setBody(DisableAutoResourceOptimizeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAutoResourceOptimizeRulesResponseBody getBody() {
        return this.body;
    }

}
