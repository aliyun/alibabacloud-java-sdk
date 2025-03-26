// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CreateAccessWarrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessWarrantResponseBody body;

    public static CreateAccessWarrantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessWarrantResponse self = new CreateAccessWarrantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessWarrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessWarrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessWarrantResponse setBody(CreateAccessWarrantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessWarrantResponseBody getBody() {
        return this.body;
    }

}
