// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameHangResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetGameHangResponseBody body;

    public static SetGameHangResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGameHangResponse self = new SetGameHangResponse();
        return TeaModel.build(map, self);
    }

    public SetGameHangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGameHangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGameHangResponse setBody(SetGameHangResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGameHangResponseBody getBody() {
        return this.body;
    }

}
