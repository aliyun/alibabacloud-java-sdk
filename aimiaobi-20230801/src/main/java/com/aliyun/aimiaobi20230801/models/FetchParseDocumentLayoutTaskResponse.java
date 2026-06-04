// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchParseDocumentLayoutTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchParseDocumentLayoutTaskResponseBody body;

    public static FetchParseDocumentLayoutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchParseDocumentLayoutTaskResponse self = new FetchParseDocumentLayoutTaskResponse();
        return TeaModel.build(map, self);
    }

    public FetchParseDocumentLayoutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchParseDocumentLayoutTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchParseDocumentLayoutTaskResponse setBody(FetchParseDocumentLayoutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchParseDocumentLayoutTaskResponseBody getBody() {
        return this.body;
    }

}
