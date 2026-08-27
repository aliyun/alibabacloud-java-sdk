// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayAuthorizableSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayAuthorizableSecurityGroupsResponseBody body;

    public static ListGatewayAuthorizableSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthorizableSecurityGroupsResponse self = new ListGatewayAuthorizableSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthorizableSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayAuthorizableSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayAuthorizableSecurityGroupsResponse setBody(ListGatewayAuthorizableSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayAuthorizableSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
