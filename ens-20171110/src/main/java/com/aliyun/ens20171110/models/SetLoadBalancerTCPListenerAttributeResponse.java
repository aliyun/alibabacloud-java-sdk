// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerTCPListenerAttributeResponseBody body;

    public static SetLoadBalancerTCPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerTCPListenerAttributeResponse self = new SetLoadBalancerTCPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerTCPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerTCPListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerTCPListenerAttributeResponse setBody(SetLoadBalancerTCPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerTCPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
