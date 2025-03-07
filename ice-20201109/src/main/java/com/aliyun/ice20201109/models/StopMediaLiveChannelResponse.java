// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMediaLiveChannelResponseBody body;

    public static StopMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMediaLiveChannelResponse self = new StopMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public StopMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMediaLiveChannelResponse setBody(StopMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
