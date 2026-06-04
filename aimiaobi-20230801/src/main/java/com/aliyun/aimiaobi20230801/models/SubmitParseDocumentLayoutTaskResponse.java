// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitParseDocumentLayoutTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitParseDocumentLayoutTaskResponseBody body;

    public static SubmitParseDocumentLayoutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitParseDocumentLayoutTaskResponse self = new SubmitParseDocumentLayoutTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitParseDocumentLayoutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitParseDocumentLayoutTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitParseDocumentLayoutTaskResponse setBody(SubmitParseDocumentLayoutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitParseDocumentLayoutTaskResponseBody getBody() {
        return this.body;
    }

}
