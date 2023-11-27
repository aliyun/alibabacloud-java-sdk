// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class KickOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public KickOffResponseBody body;

    public static KickOffResponse build(java.util.Map<String, ?> map) throws Exception {
        KickOffResponse self = new KickOffResponse();
        return TeaModel.build(map, self);
    }

    public KickOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickOffResponse setBody(KickOffResponseBody body) {
        this.body = body;
        return this;
    }
    public KickOffResponseBody getBody() {
        return this.body;
    }

}
