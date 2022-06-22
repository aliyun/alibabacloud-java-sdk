// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleOffResponseBody body;

    public static SentinelDegradeRuleOffResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOffResponse self = new SentinelDegradeRuleOffResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleOffResponse setBody(SentinelDegradeRuleOffResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleOffResponseBody getBody() {
        return this.body;
    }

}
