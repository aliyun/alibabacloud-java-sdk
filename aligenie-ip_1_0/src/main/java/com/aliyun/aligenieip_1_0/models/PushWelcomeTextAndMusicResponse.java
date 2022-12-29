// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushWelcomeTextAndMusicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushWelcomeTextAndMusicResponseBody body;

    public static PushWelcomeTextAndMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        PushWelcomeTextAndMusicResponse self = new PushWelcomeTextAndMusicResponse();
        return TeaModel.build(map, self);
    }

    public PushWelcomeTextAndMusicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushWelcomeTextAndMusicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushWelcomeTextAndMusicResponse setBody(PushWelcomeTextAndMusicResponseBody body) {
        this.body = body;
        return this;
    }
    public PushWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

}
