// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableLoadBalancerAccessLogResponseBody body;

    public static DisableLoadBalancerAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerAccessLogResponse self = new DisableLoadBalancerAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLoadBalancerAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableLoadBalancerAccessLogResponse setBody(DisableLoadBalancerAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLoadBalancerAccessLogResponseBody getBody() {
        return this.body;
    }

}
