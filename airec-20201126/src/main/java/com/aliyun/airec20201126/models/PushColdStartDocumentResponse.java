// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushColdStartDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushColdStartDocumentResponseBody body;

    public static PushColdStartDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        PushColdStartDocumentResponse self = new PushColdStartDocumentResponse();
        return TeaModel.build(map, self);
    }

    public PushColdStartDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushColdStartDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushColdStartDocumentResponse setBody(PushColdStartDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public PushColdStartDocumentResponseBody getBody() {
        return this.body;
    }

}
