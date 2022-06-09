// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StartGameLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartGameLiveResponseBody body;

    public static StartGameLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        StartGameLiveResponse self = new StartGameLiveResponse();
        return TeaModel.build(map, self);
    }

    public StartGameLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartGameLiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartGameLiveResponse setBody(StartGameLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public StartGameLiveResponseBody getBody() {
        return this.body;
    }

}
