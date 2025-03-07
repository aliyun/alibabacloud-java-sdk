// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaLiveChannelResponseBody body;

    public static CreateMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveChannelResponse self = new CreateMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaLiveChannelResponse setBody(CreateMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
