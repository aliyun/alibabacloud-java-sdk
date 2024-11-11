// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayModeControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PlayModeControlResponseBody body;

    public static PlayModeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayModeControlResponse self = new PlayModeControlResponse();
        return TeaModel.build(map, self);
    }

    public PlayModeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayModeControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlayModeControlResponse setBody(PlayModeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayModeControlResponseBody getBody() {
        return this.body;
    }

}
