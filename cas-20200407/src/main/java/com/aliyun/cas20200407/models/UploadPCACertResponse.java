// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadPCACertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadPCACertResponseBody body;

    public static UploadPCACertResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadPCACertResponse self = new UploadPCACertResponse();
        return TeaModel.build(map, self);
    }

    public UploadPCACertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadPCACertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadPCACertResponse setBody(UploadPCACertResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadPCACertResponseBody getBody() {
        return this.body;
    }

}
