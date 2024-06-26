// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChannelResponseBody body;

    public static CreateChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelResponse self = new CreateChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChannelResponse setBody(CreateChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChannelResponseBody getBody() {
        return this.body;
    }

}
