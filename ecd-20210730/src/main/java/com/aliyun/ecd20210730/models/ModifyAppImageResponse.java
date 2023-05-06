// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ModifyAppImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppImageResponseBody body;

    public static ModifyAppImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppImageResponse self = new ModifyAppImageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppImageResponse setBody(ModifyAppImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppImageResponseBody getBody() {
        return this.body;
    }

}
