// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveStreamBlockResponseBody body;

    public static SetLiveStreamBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamBlockResponse self = new SetLiveStreamBlockResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveStreamBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveStreamBlockResponse setBody(SetLiveStreamBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamBlockResponseBody getBody() {
        return this.body;
    }

}
