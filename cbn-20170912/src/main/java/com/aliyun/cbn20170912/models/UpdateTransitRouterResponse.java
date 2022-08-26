// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTransitRouterResponseBody body;

    public static UpdateTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterResponse self = new UpdateTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterResponse setBody(UpdateTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterResponseBody getBody() {
        return this.body;
    }

}
