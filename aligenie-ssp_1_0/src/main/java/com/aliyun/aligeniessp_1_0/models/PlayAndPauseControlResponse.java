// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayAndPauseControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PlayAndPauseControlResponseBody body;

    public static PlayAndPauseControlResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayAndPauseControlResponse self = new PlayAndPauseControlResponse();
        return TeaModel.build(map, self);
    }

    public PlayAndPauseControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayAndPauseControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlayAndPauseControlResponse setBody(PlayAndPauseControlResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayAndPauseControlResponseBody getBody() {
        return this.body;
    }

}
