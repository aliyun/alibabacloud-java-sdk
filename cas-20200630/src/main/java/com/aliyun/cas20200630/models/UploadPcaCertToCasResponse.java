// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UploadPcaCertToCasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadPcaCertToCasResponseBody body;

    public static UploadPcaCertToCasResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadPcaCertToCasResponse self = new UploadPcaCertToCasResponse();
        return TeaModel.build(map, self);
    }

    public UploadPcaCertToCasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadPcaCertToCasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadPcaCertToCasResponse setBody(UploadPcaCertToCasResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadPcaCertToCasResponseBody getBody() {
        return this.body;
    }

}
