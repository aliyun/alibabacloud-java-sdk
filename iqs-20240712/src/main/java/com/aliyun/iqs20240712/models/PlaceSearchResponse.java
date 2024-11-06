// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class PlaceSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PlaceSearchResponseBody body;

    public static PlaceSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        PlaceSearchResponse self = new PlaceSearchResponse();
        return TeaModel.build(map, self);
    }

    public PlaceSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlaceSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlaceSearchResponse setBody(PlaceSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public PlaceSearchResponseBody getBody() {
        return this.body;
    }

}
