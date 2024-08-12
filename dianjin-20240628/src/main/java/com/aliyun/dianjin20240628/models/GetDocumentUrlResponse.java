// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentUrlResponseBody body;

    public static GetDocumentUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentUrlResponse self = new GetDocumentUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentUrlResponse setBody(GetDocumentUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentUrlResponseBody getBody() {
        return this.body;
    }

}
