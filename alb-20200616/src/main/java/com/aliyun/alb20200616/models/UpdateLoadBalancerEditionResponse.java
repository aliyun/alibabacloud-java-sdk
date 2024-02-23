// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerEditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoadBalancerEditionResponseBody body;

    public static UpdateLoadBalancerEditionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerEditionResponse self = new UpdateLoadBalancerEditionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerEditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerEditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoadBalancerEditionResponse setBody(UpdateLoadBalancerEditionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerEditionResponseBody getBody() {
        return this.body;
    }

}
