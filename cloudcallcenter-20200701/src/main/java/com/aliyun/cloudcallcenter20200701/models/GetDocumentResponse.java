// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentResponseBody body;

    public static GetDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentResponse self = new GetDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentResponse setBody(GetDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentResponseBody getBody() {
        return this.body;
    }

}
