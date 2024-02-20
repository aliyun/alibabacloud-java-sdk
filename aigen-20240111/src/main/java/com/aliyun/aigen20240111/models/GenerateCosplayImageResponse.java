// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateCosplayImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCosplayImageResponseBody body;

    public static GenerateCosplayImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCosplayImageResponse self = new GenerateCosplayImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCosplayImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCosplayImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCosplayImageResponse setBody(GenerateCosplayImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCosplayImageResponseBody getBody() {
        return this.body;
    }

}
