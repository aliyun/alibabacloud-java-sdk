// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterTransitRouterMulticastGroupSourcesResponseBody body;

    public static RegisterTransitRouterMulticastGroupSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupSourcesResponse self = new RegisterTransitRouterMulticastGroupSourcesResponse();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterTransitRouterMulticastGroupSourcesResponse setBody(RegisterTransitRouterMulticastGroupSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

}
