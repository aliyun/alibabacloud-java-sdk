// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResizeDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeDbfsResponseBody body;

    public static ResizeDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeDbfsResponse self = new ResizeDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ResizeDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeDbfsResponse setBody(ResizeDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeDbfsResponseBody getBody() {
        return this.body;
    }

}
