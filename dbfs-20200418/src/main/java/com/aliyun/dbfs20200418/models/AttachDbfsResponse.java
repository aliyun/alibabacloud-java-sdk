// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AttachDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDbfsResponseBody body;

    public static AttachDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDbfsResponse self = new AttachDbfsResponse();
        return TeaModel.build(map, self);
    }

    public AttachDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDbfsResponse setBody(AttachDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDbfsResponseBody getBody() {
        return this.body;
    }

}
