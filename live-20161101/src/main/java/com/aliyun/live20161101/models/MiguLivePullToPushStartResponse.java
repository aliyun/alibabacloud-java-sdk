// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MiguLivePullToPushStartResponseBody body;

    public static MiguLivePullToPushStartResponse build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStartResponse self = new MiguLivePullToPushStartResponse();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MiguLivePullToPushStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MiguLivePullToPushStartResponse setBody(MiguLivePullToPushStartResponseBody body) {
        this.body = body;
        return this;
    }
    public MiguLivePullToPushStartResponseBody getBody() {
        return this.body;
    }

}
