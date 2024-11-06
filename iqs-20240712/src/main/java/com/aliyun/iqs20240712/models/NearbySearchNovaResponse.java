// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NearbySearchNovaResponseBody body;

    public static NearbySearchNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchNovaResponse self = new NearbySearchNovaResponse();
        return TeaModel.build(map, self);
    }

    public NearbySearchNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NearbySearchNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NearbySearchNovaResponse setBody(NearbySearchNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public NearbySearchNovaResponseBody getBody() {
        return this.body;
    }

}
