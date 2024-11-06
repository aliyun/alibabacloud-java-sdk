// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class PlaceSearchNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PlaceSearchNovaResponseBody body;

    public static PlaceSearchNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        PlaceSearchNovaResponse self = new PlaceSearchNovaResponse();
        return TeaModel.build(map, self);
    }

    public PlaceSearchNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlaceSearchNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlaceSearchNovaResponse setBody(PlaceSearchNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public PlaceSearchNovaResponseBody getBody() {
        return this.body;
    }

}
