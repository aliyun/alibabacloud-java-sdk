// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewayQuotaRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGatewayQuotaRuleResponseBody body;

    public static AddGatewayQuotaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayQuotaRuleResponse self = new AddGatewayQuotaRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayQuotaRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayQuotaRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewayQuotaRuleResponse setBody(AddGatewayQuotaRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayQuotaRuleResponseBody getBody() {
        return this.body;
    }

}
