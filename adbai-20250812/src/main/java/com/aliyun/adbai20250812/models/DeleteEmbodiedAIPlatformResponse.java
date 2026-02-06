// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DeleteEmbodiedAIPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEmbodiedAIPlatformResponseBody body;

    public static DeleteEmbodiedAIPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmbodiedAIPlatformResponse self = new DeleteEmbodiedAIPlatformResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEmbodiedAIPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEmbodiedAIPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEmbodiedAIPlatformResponse setBody(DeleteEmbodiedAIPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEmbodiedAIPlatformResponseBody getBody() {
        return this.body;
    }

}
