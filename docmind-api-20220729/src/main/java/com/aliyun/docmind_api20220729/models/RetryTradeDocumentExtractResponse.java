// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class RetryTradeDocumentExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTradeDocumentExtractResponseBody body;

    public static RetryTradeDocumentExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTradeDocumentExtractResponse self = new RetryTradeDocumentExtractResponse();
        return TeaModel.build(map, self);
    }

    public RetryTradeDocumentExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTradeDocumentExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryTradeDocumentExtractResponse setBody(RetryTradeDocumentExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTradeDocumentExtractResponseBody getBody() {
        return this.body;
    }

}
