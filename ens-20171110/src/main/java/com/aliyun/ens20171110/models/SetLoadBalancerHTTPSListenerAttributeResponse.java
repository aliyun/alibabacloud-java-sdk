// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPSListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetLoadBalancerHTTPSListenerAttributeResponseBody body;

    public static SetLoadBalancerHTTPSListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPSListenerAttributeResponse self = new SetLoadBalancerHTTPSListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setBody(SetLoadBalancerHTTPSListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerHTTPSListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
