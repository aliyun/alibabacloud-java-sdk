// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterMulticastDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTransitRouterMulticastDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterMulticastDomainResponse setBody(CreateTransitRouterMulticastDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

}
