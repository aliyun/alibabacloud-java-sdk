// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoadBalancerResponseBody body;

    public static GetLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerResponse self = new GetLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoadBalancerResponse setBody(GetLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
