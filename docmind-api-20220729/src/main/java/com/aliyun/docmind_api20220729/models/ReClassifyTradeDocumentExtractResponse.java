// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ReClassifyTradeDocumentExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReClassifyTradeDocumentExtractResponseBody body;

    public static ReClassifyTradeDocumentExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        ReClassifyTradeDocumentExtractResponse self = new ReClassifyTradeDocumentExtractResponse();
        return TeaModel.build(map, self);
    }

    public ReClassifyTradeDocumentExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReClassifyTradeDocumentExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReClassifyTradeDocumentExtractResponse setBody(ReClassifyTradeDocumentExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public ReClassifyTradeDocumentExtractResponseBody getBody() {
        return this.body;
    }

}
