// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoadBalancerResponseBody body;

    public static UpdateLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerResponse self = new UpdateLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoadBalancerResponse setBody(UpdateLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
