// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableLoadBalancerAccessLogResponse setBody(EnableLoadBalancerAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLoadBalancerAccessLogResponseBody getBody() {
        return this.body;
    }

}
