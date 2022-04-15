// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransitRouterMulticastDomainResponseBody body;

    public static CreateTransitRouterMulticastDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterMulticastDomainResponse self = new CreateTransitRouterMulticastDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterMulticastDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterMulticastDomainResponse setBody(CreateTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
