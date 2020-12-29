// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCenRouteMapResponseBody body;

    public static DeleteCenRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenRouteMapResponse self = new DeleteCenRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenRouteMapResponse setBody(DeleteCenRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenRouteMapResponseBody getBody() {
        return this.body;
    }

}
