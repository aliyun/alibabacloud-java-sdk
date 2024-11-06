// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NearbySearchResponseBody body;

    public static NearbySearchResponse build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchResponse self = new NearbySearchResponse();
        return TeaModel.build(map, self);
    }

    public NearbySearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NearbySearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NearbySearchResponse setBody(NearbySearchResponseBody body) {
        this.body = body;
        return this;
    }
    public NearbySearchResponseBody getBody() {
        return this.body;
    }

}
