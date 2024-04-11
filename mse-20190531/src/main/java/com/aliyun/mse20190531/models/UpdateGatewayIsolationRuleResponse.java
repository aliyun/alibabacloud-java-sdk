// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayIsolationRuleResponseBody body;

    public static UpdateGatewayIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayIsolationRuleResponse self = new UpdateGatewayIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayIsolationRuleResponse setBody(UpdateGatewayIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
