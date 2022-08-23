// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class KickStaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public KickStaResponseBody body;

    public static KickStaResponse build(java.util.Map<String, ?> map) throws Exception {
        KickStaResponse self = new KickStaResponse();
        return TeaModel.build(map, self);
    }

    public KickStaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickStaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickStaResponse setBody(KickStaResponseBody body) {
        this.body = body;
        return this;
    }
    public KickStaResponseBody getBody() {
        return this.body;
    }

}
