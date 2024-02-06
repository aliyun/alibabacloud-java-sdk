// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLoadBalancerAttributeResponseBody body;

    public static ModifyLoadBalancerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerAttributeResponse self = new ModifyLoadBalancerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoadBalancerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoadBalancerAttributeResponse setBody(ModifyLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
