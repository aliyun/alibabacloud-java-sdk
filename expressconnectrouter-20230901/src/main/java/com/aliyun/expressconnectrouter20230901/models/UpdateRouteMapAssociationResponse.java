// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class UpdateRouteMapAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRouteMapAssociationResponseBody body;

    public static UpdateRouteMapAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapAssociationResponse self = new UpdateRouteMapAssociationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteMapAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRouteMapAssociationResponse setBody(UpdateRouteMapAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteMapAssociationResponseBody getBody() {
        return this.body;
    }

}
