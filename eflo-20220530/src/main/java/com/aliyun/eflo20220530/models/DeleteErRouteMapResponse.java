// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteErRouteMapResponseBody body;

    public static DeleteErRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteErRouteMapResponse self = new DeleteErRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteErRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteErRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteErRouteMapResponse setBody(DeleteErRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteErRouteMapResponseBody getBody() {
        return this.body;
    }

}
