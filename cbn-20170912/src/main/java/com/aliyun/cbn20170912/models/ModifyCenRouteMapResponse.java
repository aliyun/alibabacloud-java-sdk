// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCenRouteMapResponseBody body;

    public static ModifyCenRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenRouteMapResponse self = new ModifyCenRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCenRouteMapResponse setBody(ModifyCenRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenRouteMapResponseBody getBody() {
        return this.body;
    }

}
