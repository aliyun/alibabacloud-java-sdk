// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentExtractResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentExtractResultResponseBody body;

    public static GetDocumentExtractResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentExtractResultResponse self = new GetDocumentExtractResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentExtractResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentExtractResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentExtractResultResponse setBody(GetDocumentExtractResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentExtractResultResponseBody getBody() {
        return this.body;
    }

}
