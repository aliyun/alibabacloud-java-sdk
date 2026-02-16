// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class UnlockEmbodiedAIPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockEmbodiedAIPlatformResponseBody body;

    public static UnlockEmbodiedAIPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockEmbodiedAIPlatformResponse self = new UnlockEmbodiedAIPlatformResponse();
        return TeaModel.build(map, self);
    }

    public UnlockEmbodiedAIPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockEmbodiedAIPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockEmbodiedAIPlatformResponse setBody(UnlockEmbodiedAIPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockEmbodiedAIPlatformResponseBody getBody() {
        return this.body;
    }

}
