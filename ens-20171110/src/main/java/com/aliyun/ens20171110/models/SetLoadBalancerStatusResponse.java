// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetLoadBalancerStatusResponseBody body;

    public static SetLoadBalancerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerStatusResponse self = new SetLoadBalancerStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerStatusResponse setBody(SetLoadBalancerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerStatusResponseBody getBody() {
        return this.body;
    }

}
