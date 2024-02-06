// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLoadBalancerListenerResponseBody body;

    public static StartLoadBalancerListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLoadBalancerListenerResponse self = new StartLoadBalancerListenerResponse();
        return TeaModel.build(map, self);
    }

    public StartLoadBalancerListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLoadBalancerListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLoadBalancerListenerResponse setBody(StartLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
