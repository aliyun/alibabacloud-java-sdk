// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChannelResponseBody body;

    public static GetChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChannelResponse self = new GetChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChannelResponse setBody(GetChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChannelResponseBody getBody() {
        return this.body;
    }

}
