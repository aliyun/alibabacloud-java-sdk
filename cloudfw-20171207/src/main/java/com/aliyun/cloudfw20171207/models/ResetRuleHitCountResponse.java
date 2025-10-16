// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetRuleHitCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetRuleHitCountResponseBody body;

    public static ResetRuleHitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetRuleHitCountResponse self = new ResetRuleHitCountResponse();
        return TeaModel.build(map, self);
    }

    public ResetRuleHitCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetRuleHitCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetRuleHitCountResponse setBody(ResetRuleHitCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetRuleHitCountResponseBody getBody() {
        return this.body;
    }

}
