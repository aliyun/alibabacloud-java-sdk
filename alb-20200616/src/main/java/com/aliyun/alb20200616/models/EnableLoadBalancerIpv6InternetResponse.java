// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerIpv6InternetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLoadBalancerIpv6InternetResponseBody body;

    public static EnableLoadBalancerIpv6InternetResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerIpv6InternetResponse self = new EnableLoadBalancerIpv6InternetResponse();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerIpv6InternetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLoadBalancerIpv6InternetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableLoadBalancerIpv6InternetResponse setBody(EnableLoadBalancerIpv6InternetResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLoadBalancerIpv6InternetResponseBody getBody() {
        return this.body;
    }

}
