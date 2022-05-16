// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class KickPlayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public KickPlayerResponseBody body;

    public static KickPlayerResponse build(java.util.Map<String, ?> map) throws Exception {
        KickPlayerResponse self = new KickPlayerResponse();
        return TeaModel.build(map, self);
    }

    public KickPlayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickPlayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickPlayerResponse setBody(KickPlayerResponseBody body) {
        this.body = body;
        return this;
    }
    public KickPlayerResponseBody getBody() {
        return this.body;
    }

}
