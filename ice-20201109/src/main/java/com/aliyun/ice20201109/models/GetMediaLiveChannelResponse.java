// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaLiveChannelResponseBody body;

    public static GetMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveChannelResponse self = new GetMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaLiveChannelResponse setBody(GetMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
