// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayQuotaRuleResponseBody body;

    public static GetGatewayQuotaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleResponse self = new GetGatewayQuotaRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayQuotaRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayQuotaRuleResponse setBody(GetGatewayQuotaRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayQuotaRuleResponseBody getBody() {
        return this.body;
    }

}
