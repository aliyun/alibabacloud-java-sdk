// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewaySecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewaySecurityGroupRuleResponseBody body;

    public static DeleteGatewaySecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySecurityGroupRuleResponse self = new DeleteGatewaySecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewaySecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewaySecurityGroupRuleResponse setBody(DeleteGatewaySecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewaySecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
