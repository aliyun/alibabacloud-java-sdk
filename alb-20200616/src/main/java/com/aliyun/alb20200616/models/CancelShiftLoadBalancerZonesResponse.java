// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CancelShiftLoadBalancerZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelShiftLoadBalancerZonesResponseBody body;

    public static CancelShiftLoadBalancerZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelShiftLoadBalancerZonesResponse self = new CancelShiftLoadBalancerZonesResponse();
        return TeaModel.build(map, self);
    }

    public CancelShiftLoadBalancerZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelShiftLoadBalancerZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelShiftLoadBalancerZonesResponse setBody(CancelShiftLoadBalancerZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelShiftLoadBalancerZonesResponseBody getBody() {
        return this.body;
    }

}
