// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateRouteMapAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteMapAssociationResponseBody body;

    public static CreateRouteMapAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapAssociationResponse self = new CreateRouteMapAssociationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteMapAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteMapAssociationResponse setBody(CreateRouteMapAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteMapAssociationResponseBody getBody() {
        return this.body;
    }

}
