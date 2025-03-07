// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaLiveChannelResponseBody body;

    public static UpdateMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveChannelResponse self = new UpdateMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaLiveChannelResponse setBody(UpdateMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
