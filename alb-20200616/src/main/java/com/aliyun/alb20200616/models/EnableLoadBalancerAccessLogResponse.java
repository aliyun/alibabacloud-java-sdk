// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableLoadBalancerAccessLogResponseBody body;

    public static EnableLoadBalancerAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerAccessLogResponse self = new EnableLoadBalancerAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLoadBalancerAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableLoadBalancerAccessLogResponse setBody(EnableLoadBalancerAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLoadBalancerAccessLogResponseBody getBody() {
        return this.body;
    }

}
