// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachLoadBalancersResponseBody body;

    public static DetachLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachLoadBalancersResponse self = new DetachLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public DetachLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachLoadBalancersResponse setBody(DetachLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
