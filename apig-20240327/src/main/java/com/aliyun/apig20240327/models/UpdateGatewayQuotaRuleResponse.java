// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayQuotaRuleResponseBody body;

    public static UpdateGatewayQuotaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleResponse self = new UpdateGatewayQuotaRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayQuotaRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayQuotaRuleResponse setBody(UpdateGatewayQuotaRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayQuotaRuleResponseBody getBody() {
        return this.body;
    }

}
