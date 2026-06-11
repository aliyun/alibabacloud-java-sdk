// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewayQuotaRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayQuotaRuleResponseBody body;

    public static DeleteGatewayQuotaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayQuotaRuleResponse self = new DeleteGatewayQuotaRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayQuotaRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayQuotaRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayQuotaRuleResponse setBody(DeleteGatewayQuotaRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayQuotaRuleResponseBody getBody() {
        return this.body;
    }

}
