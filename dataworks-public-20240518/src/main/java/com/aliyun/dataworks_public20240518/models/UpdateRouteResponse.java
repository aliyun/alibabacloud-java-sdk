// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRouteResponseBody body;

    public static UpdateRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteResponse self = new UpdateRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRouteResponse setBody(UpdateRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteResponseBody getBody() {
        return this.body;
    }

}
