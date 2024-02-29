// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetWelcomeTextAndMusicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWelcomeTextAndMusicResponseBody body;

    public static GetWelcomeTextAndMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWelcomeTextAndMusicResponse self = new GetWelcomeTextAndMusicResponse();
        return TeaModel.build(map, self);
    }

    public GetWelcomeTextAndMusicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWelcomeTextAndMusicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWelcomeTextAndMusicResponse setBody(GetWelcomeTextAndMusicResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

}
