// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyEmbodiedAIPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEmbodiedAIPlatformResponseBody body;

    public static ModifyEmbodiedAIPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmbodiedAIPlatformResponse self = new ModifyEmbodiedAIPlatformResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEmbodiedAIPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEmbodiedAIPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEmbodiedAIPlatformResponse setBody(ModifyEmbodiedAIPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEmbodiedAIPlatformResponseBody getBody() {
        return this.body;
    }

}
