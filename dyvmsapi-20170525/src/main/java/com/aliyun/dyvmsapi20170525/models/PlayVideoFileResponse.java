// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class PlayVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PlayVideoFileResponseBody body;

    public static PlayVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayVideoFileResponse self = new PlayVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public PlayVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlayVideoFileResponse setBody(PlayVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayVideoFileResponseBody getBody() {
        return this.body;
    }

}
