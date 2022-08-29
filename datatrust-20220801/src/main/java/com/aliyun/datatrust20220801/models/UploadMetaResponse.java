// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class UploadMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMetaResponseBody body;

    public static UploadMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMetaResponse self = new UploadMetaResponse();
        return TeaModel.build(map, self);
    }

    public UploadMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMetaResponse setBody(UploadMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMetaResponseBody getBody() {
        return this.body;
    }

}
