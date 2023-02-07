// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class GetSingleDocumentExtractResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSingleDocumentExtractResultResponseBody body;

    public static GetSingleDocumentExtractResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSingleDocumentExtractResultResponse self = new GetSingleDocumentExtractResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSingleDocumentExtractResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSingleDocumentExtractResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSingleDocumentExtractResultResponse setBody(GetSingleDocumentExtractResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSingleDocumentExtractResultResponseBody getBody() {
        return this.body;
    }

}
