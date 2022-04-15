// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTransitRouterMulticastDomainResponseBody body;

    public static DeleteTransitRouterMulticastDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterMulticastDomainResponse self = new DeleteTransitRouterMulticastDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterMulticastDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterMulticastDomainResponse setBody(DeleteTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
