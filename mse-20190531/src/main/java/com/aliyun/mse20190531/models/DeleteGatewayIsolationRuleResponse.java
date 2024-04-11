// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayIsolationRuleResponseBody body;

    public static DeleteGatewayIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIsolationRuleResponse self = new DeleteGatewayIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayIsolationRuleResponse setBody(DeleteGatewayIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
