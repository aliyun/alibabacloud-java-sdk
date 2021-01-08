// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class PushDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PushDocumentResponse setBody(PushDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDocumentResponseBody getBody() {
        return this.body;
    }

}
