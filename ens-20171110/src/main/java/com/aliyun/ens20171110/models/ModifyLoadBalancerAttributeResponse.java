// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyLoadBalancerAttributeResponse setBody(ModifyLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
