// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchAddDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddDocumentResult body;

    public static BatchAddDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDocumentResponse self = new BatchAddDocumentResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddDocumentResponse setBody(BatchAddDocumentResult body) {
        this.body = body;
        return this;
    }
    public BatchAddDocumentResult getBody() {
        return this.body;
    }

}
