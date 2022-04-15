// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTransitRouterMulticastDomainResponseBody body;

    public static ModifyTransitRouterMulticastDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterMulticastDomainResponse self = new ModifyTransitRouterMulticastDomainResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterMulticastDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTransitRouterMulticastDomainResponse setBody(ModifyTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
