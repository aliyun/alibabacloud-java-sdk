// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayLoadBalancerResponseBody body;

    public static UpdateGatewayLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLoadBalancerResponse self = new UpdateGatewayLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayLoadBalancerResponse setBody(UpdateGatewayLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
