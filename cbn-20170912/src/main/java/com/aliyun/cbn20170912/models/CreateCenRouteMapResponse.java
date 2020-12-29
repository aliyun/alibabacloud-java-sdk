// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCenRouteMapResponseBody body;

    public static CreateCenRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRouteMapResponse self = new CreateCenRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenRouteMapResponse setBody(CreateCenRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenRouteMapResponseBody getBody() {
        return this.body;
    }

}
