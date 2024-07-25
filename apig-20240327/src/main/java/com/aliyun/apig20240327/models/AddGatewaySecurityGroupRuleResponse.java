// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewaySecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGatewaySecurityGroupRuleResponseBody body;

    public static AddGatewaySecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySecurityGroupRuleResponse self = new AddGatewaySecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewaySecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewaySecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewaySecurityGroupRuleResponse setBody(AddGatewaySecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewaySecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
