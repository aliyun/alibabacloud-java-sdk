// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartChannelResponseBody body;

    public static StartChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        StartChannelResponse self = new StartChannelResponse();
        return TeaModel.build(map, self);
    }

    public StartChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartChannelResponse setBody(StartChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public StartChannelResponseBody getBody() {
        return this.body;
    }

}
