// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLoadBalancerListenerResponseBody body;

    public static DeleteLoadBalancerListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerListenerResponse self = new DeleteLoadBalancerListenerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLoadBalancerListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLoadBalancerListenerResponse setBody(DeleteLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
