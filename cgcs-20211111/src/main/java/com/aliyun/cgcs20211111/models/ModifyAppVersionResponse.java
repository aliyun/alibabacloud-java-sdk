// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppVersionResponseBody body;

    public static ModifyAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVersionResponse self = new ModifyAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppVersionResponse setBody(ModifyAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppVersionResponseBody getBody() {
        return this.body;
    }

}
