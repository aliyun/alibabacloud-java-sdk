// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayQuotaRuleStatusResponseBody body;

    public static UpdateGatewayQuotaRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleStatusResponse self = new UpdateGatewayQuotaRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayQuotaRuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayQuotaRuleStatusResponse setBody(UpdateGatewayQuotaRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayQuotaRuleStatusResponseBody getBody() {
        return this.body;
    }

}
