// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StartShiftLoadBalancerZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartShiftLoadBalancerZonesResponseBody body;

    public static StartShiftLoadBalancerZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartShiftLoadBalancerZonesResponse self = new StartShiftLoadBalancerZonesResponse();
        return TeaModel.build(map, self);
    }

    public StartShiftLoadBalancerZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartShiftLoadBalancerZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartShiftLoadBalancerZonesResponse setBody(StartShiftLoadBalancerZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartShiftLoadBalancerZonesResponseBody getBody() {
        return this.body;
    }

}
