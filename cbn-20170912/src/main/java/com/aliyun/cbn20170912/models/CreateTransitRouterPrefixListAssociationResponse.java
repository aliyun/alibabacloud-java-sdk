// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPrefixListAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterPrefixListAssociationResponseBody body;

    public static CreateTransitRouterPrefixListAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPrefixListAssociationResponse self = new CreateTransitRouterPrefixListAssociationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPrefixListAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterPrefixListAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterPrefixListAssociationResponse setBody(CreateTransitRouterPrefixListAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterPrefixListAssociationResponseBody getBody() {
        return this.body;
    }

}
