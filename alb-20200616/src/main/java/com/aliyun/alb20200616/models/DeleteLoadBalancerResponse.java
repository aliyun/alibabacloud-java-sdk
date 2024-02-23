// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLoadBalancerResponseBody body;

    public static DeleteLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerResponse self = new DeleteLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLoadBalancerResponse setBody(DeleteLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
