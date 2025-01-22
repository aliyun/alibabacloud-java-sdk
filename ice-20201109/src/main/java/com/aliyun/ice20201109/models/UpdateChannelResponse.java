// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChannelResponseBody body;

    public static UpdateChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelResponse self = new UpdateChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChannelResponse setBody(UpdateChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChannelResponseBody getBody() {
        return this.body;
    }

}
