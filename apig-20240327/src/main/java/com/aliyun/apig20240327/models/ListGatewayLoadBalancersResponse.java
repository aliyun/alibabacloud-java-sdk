// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayLoadBalancersResponseBody body;

    public static ListGatewayLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayLoadBalancersResponse self = new ListGatewayLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayLoadBalancersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayLoadBalancersResponse setBody(ListGatewayLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
