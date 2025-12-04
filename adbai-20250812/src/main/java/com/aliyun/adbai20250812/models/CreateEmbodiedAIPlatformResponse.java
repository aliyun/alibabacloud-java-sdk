// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateEmbodiedAIPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEmbodiedAIPlatformResponseBody body;

    public static CreateEmbodiedAIPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEmbodiedAIPlatformResponse self = new CreateEmbodiedAIPlatformResponse();
        return TeaModel.build(map, self);
    }

    public CreateEmbodiedAIPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEmbodiedAIPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEmbodiedAIPlatformResponse setBody(CreateEmbodiedAIPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEmbodiedAIPlatformResponseBody getBody() {
        return this.body;
    }

}
