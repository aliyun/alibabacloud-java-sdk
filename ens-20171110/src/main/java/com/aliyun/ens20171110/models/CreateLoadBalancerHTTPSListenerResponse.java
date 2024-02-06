// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPSListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoadBalancerHTTPSListenerResponseBody body;

    public static CreateLoadBalancerHTTPSListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPSListenerResponse self = new CreateLoadBalancerHTTPSListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPSListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerHTTPSListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadBalancerHTTPSListenerResponse setBody(CreateLoadBalancerHTTPSListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerHTTPSListenerResponseBody getBody() {
        return this.body;
    }

}
