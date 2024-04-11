// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayIsolationRuleResponseBody body;

    public static ListGatewayIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIsolationRuleResponse self = new ListGatewayIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayIsolationRuleResponse setBody(ListGatewayIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
