// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoadBalancerUDPListenerResponseBody body;

    public static CreateLoadBalancerUDPListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerResponse self = new CreateLoadBalancerUDPListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerUDPListenerResponse setBody(CreateLoadBalancerUDPListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerUDPListenerResponseBody getBody() {
        return this.body;
    }

}
