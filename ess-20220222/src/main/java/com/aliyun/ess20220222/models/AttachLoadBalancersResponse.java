// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AttachLoadBalancersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachLoadBalancersResponse setBody(AttachLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
