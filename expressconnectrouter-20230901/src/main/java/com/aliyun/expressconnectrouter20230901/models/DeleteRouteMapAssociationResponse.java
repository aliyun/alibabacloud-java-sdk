// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DeleteRouteMapAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteMapAssociationResponseBody body;

    public static DeleteRouteMapAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapAssociationResponse self = new DeleteRouteMapAssociationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteMapAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteMapAssociationResponse setBody(DeleteRouteMapAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteMapAssociationResponseBody getBody() {
        return this.body;
    }

}
