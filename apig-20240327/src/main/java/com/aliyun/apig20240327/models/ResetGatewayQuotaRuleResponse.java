// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResetGatewayQuotaRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetGatewayQuotaRuleResponseBody body;

    public static ResetGatewayQuotaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetGatewayQuotaRuleResponse self = new ResetGatewayQuotaRuleResponse();
        return TeaModel.build(map, self);
    }

    public ResetGatewayQuotaRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetGatewayQuotaRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetGatewayQuotaRuleResponse setBody(ResetGatewayQuotaRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetGatewayQuotaRuleResponseBody getBody() {
        return this.body;
    }

}
