// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class GeoCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeoCodeResponseBody body;

    public static GeoCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GeoCodeResponse self = new GeoCodeResponse();
        return TeaModel.build(map, self);
    }

    public GeoCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeoCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeoCodeResponse setBody(GeoCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GeoCodeResponseBody getBody() {
        return this.body;
    }

}
