// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoadBalancerHTTPListenerResponseBody body;

    public static CreateLoadBalancerHTTPListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPListenerResponse self = new CreateLoadBalancerHTTPListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerHTTPListenerResponse setBody(CreateLoadBalancerHTTPListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerHTTPListenerResponseBody getBody() {
        return this.body;
    }

}
