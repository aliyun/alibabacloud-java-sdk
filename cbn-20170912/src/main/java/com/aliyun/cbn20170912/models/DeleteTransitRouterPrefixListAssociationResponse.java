// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPrefixListAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTransitRouterPrefixListAssociationResponseBody body;

    public static DeleteTransitRouterPrefixListAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPrefixListAssociationResponse self = new DeleteTransitRouterPrefixListAssociationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPrefixListAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterPrefixListAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterPrefixListAssociationResponse setBody(DeleteTransitRouterPrefixListAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterPrefixListAssociationResponseBody getBody() {
        return this.body;
    }

}
