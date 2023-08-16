// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDynamicRouteResponseBody body;

    public static UpdateDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicRouteResponse self = new UpdateDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDynamicRouteResponse setBody(UpdateDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
