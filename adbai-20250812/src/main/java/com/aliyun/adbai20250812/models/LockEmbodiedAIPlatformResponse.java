// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class LockEmbodiedAIPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LockEmbodiedAIPlatformResponseBody body;

    public static LockEmbodiedAIPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        LockEmbodiedAIPlatformResponse self = new LockEmbodiedAIPlatformResponse();
        return TeaModel.build(map, self);
    }

    public LockEmbodiedAIPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockEmbodiedAIPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockEmbodiedAIPlatformResponse setBody(LockEmbodiedAIPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public LockEmbodiedAIPlatformResponseBody getBody() {
        return this.body;
    }

}
