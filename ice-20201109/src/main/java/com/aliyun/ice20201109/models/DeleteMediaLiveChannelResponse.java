// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaLiveChannelResponseBody body;

    public static DeleteMediaLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaLiveChannelResponse self = new DeleteMediaLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaLiveChannelResponse setBody(DeleteMediaLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaLiveChannelResponseBody getBody() {
        return this.body;
    }

}
