// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateErRouteMapResponseBody body;

    public static UpdateErRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateErRouteMapResponse self = new UpdateErRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateErRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateErRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateErRouteMapResponse setBody(UpdateErRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateErRouteMapResponseBody getBody() {
        return this.body;
    }

}
