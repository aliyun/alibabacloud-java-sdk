// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCsrResponseBody body;

    public static UploadCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCsrResponse self = new UploadCsrResponse();
        return TeaModel.build(map, self);
    }

    public UploadCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCsrResponse setBody(UploadCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCsrResponseBody getBody() {
        return this.body;
    }

}
