// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProductResponseBody body;

    public static ModifyProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProductResponse self = new ModifyProductResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProductResponse setBody(ModifyProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProductResponseBody getBody() {
        return this.body;
    }

}
