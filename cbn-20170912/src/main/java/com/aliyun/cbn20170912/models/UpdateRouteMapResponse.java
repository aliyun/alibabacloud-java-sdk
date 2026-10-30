// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRouteMapResponseBody body;

    public static UpdateRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapResponse self = new UpdateRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRouteMapResponse setBody(UpdateRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteMapResponseBody getBody() {
        return this.body;
    }

}
