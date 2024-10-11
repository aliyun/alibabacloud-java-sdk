// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushDocumentResponseBody body;

    public static PushDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDocumentResponse self = new PushDocumentResponse();
        return TeaModel.build(map, self);
    }

    public PushDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDocumentResponse setBody(PushDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDocumentResponseBody getBody() {
        return this.body;
    }

}
