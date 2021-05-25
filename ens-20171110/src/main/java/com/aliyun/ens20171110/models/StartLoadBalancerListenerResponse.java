// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartLoadBalancerListenerResponse setBody(StartLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
