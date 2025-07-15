// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MiguLivePullToPushStatusResponseBody body;

    public static MiguLivePullToPushStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStatusResponse self = new MiguLivePullToPushStatusResponse();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MiguLivePullToPushStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MiguLivePullToPushStatusResponse setBody(MiguLivePullToPushStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public MiguLivePullToPushStatusResponseBody getBody() {
        return this.body;
    }

}
