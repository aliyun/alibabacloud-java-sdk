// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CancelGameHangResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelGameHangResponseBody body;

    public static CancelGameHangResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelGameHangResponse self = new CancelGameHangResponse();
        return TeaModel.build(map, self);
    }

    public CancelGameHangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelGameHangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelGameHangResponse setBody(CancelGameHangResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelGameHangResponseBody getBody() {
        return this.body;
    }

}
