// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayAuthorizedSecurityGroupRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayAuthorizedSecurityGroupRulesResponseBody body;

    public static ListGatewayAuthorizedSecurityGroupRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthorizedSecurityGroupRulesResponse self = new ListGatewayAuthorizedSecurityGroupRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponse setBody(ListGatewayAuthorizedSecurityGroupRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayAuthorizedSecurityGroupRulesResponseBody getBody() {
        return this.body;
    }

}
