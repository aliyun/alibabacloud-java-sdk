// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifySampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySampleResponseBody body;

    public static ModifySampleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySampleResponse self = new ModifySampleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySampleResponse setBody(ModifySampleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySampleResponseBody getBody() {
        return this.body;
    }

}
