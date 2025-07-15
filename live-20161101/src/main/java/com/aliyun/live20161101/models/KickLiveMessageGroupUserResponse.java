// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class KickLiveMessageGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KickLiveMessageGroupUserResponseBody body;

    public static KickLiveMessageGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        KickLiveMessageGroupUserResponse self = new KickLiveMessageGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public KickLiveMessageGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickLiveMessageGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickLiveMessageGroupUserResponse setBody(KickLiveMessageGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public KickLiveMessageGroupUserResponseBody getBody() {
        return this.body;
    }

}
