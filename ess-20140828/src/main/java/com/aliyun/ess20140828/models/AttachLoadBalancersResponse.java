// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachLoadBalancersResponseBody body;

    public static AttachLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachLoadBalancersResponse self = new AttachLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public AttachLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachLoadBalancersResponse setBody(AttachLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
