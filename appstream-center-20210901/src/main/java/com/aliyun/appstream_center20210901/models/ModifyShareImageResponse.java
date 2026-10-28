// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyShareImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyShareImageResponseBody body;

    public static ModifyShareImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyShareImageResponse self = new ModifyShareImageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyShareImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyShareImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyShareImageResponse setBody(ModifyShareImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyShareImageResponseBody getBody() {
        return this.body;
    }

}
