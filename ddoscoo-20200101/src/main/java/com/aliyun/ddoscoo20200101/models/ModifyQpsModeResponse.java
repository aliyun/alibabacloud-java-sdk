// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyQpsModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyQpsModeResponseBody body;

    public static ModifyQpsModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQpsModeResponse self = new ModifyQpsModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQpsModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQpsModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQpsModeResponse setBody(ModifyQpsModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQpsModeResponseBody getBody() {
        return this.body;
    }

}
