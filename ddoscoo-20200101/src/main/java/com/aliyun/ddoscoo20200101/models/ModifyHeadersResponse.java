// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHeadersResponseBody body;

    public static ModifyHeadersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHeadersResponse self = new ModifyHeadersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHeadersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHeadersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHeadersResponse setBody(ModifyHeadersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHeadersResponseBody getBody() {
        return this.body;
    }

}
