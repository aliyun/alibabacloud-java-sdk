// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyWuyingServerSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWuyingServerSpecResponseBody body;

    public static ModifyWuyingServerSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWuyingServerSpecResponse self = new ModifyWuyingServerSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWuyingServerSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWuyingServerSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWuyingServerSpecResponse setBody(ModifyWuyingServerSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWuyingServerSpecResponseBody getBody() {
        return this.body;
    }

}
