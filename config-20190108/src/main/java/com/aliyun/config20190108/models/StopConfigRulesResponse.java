// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StopConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopConfigRulesResponseBody body;

    public static StopConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopConfigRulesResponse self = new StopConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public StopConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopConfigRulesResponse setBody(StopConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopConfigRulesResponseBody getBody() {
        return this.body;
    }

}
