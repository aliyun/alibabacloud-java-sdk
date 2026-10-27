// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ActiveContactChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveContactChannelResponseBody body;

    public static ActiveContactChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveContactChannelResponse self = new ActiveContactChannelResponse();
        return TeaModel.build(map, self);
    }

    public ActiveContactChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveContactChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveContactChannelResponse setBody(ActiveContactChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveContactChannelResponseBody getBody() {
        return this.body;
    }

}
