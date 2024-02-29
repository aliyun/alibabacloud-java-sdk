// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ResetWelcomeTextAndMusicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetWelcomeTextAndMusicResponseBody body;

    public static ResetWelcomeTextAndMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetWelcomeTextAndMusicResponse self = new ResetWelcomeTextAndMusicResponse();
        return TeaModel.build(map, self);
    }

    public ResetWelcomeTextAndMusicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetWelcomeTextAndMusicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetWelcomeTextAndMusicResponse setBody(ResetWelcomeTextAndMusicResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

}
