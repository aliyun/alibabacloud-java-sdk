// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerUDPListenerAttributeResponseBody body;

    public static SetLoadBalancerUDPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerUDPListenerAttributeResponse self = new SetLoadBalancerUDPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerUDPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerUDPListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerUDPListenerAttributeResponse setBody(SetLoadBalancerUDPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerUDPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
