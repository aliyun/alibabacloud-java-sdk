// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class KickAntStaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KickAntStaResponseBody body;

    public static KickAntStaResponse build(java.util.Map<String, ?> map) throws Exception {
        KickAntStaResponse self = new KickAntStaResponse();
        return TeaModel.build(map, self);
    }

    public KickAntStaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickAntStaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickAntStaResponse setBody(KickAntStaResponseBody body) {
        this.body = body;
        return this;
    }
    public KickAntStaResponseBody getBody() {
        return this.body;
    }

}
