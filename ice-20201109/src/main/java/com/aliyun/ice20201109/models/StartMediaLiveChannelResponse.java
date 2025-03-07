// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMediaLiveChannelResponseBody body;

    public static StartMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMediaLiveChannelResponse self = new StartMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public StartMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMediaLiveChannelResponse setBody(StartMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
