// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchTranslateResponseBody body;

    public static BatchTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateResponse self = new BatchTranslateResponse();
        return TeaModel.build(map, self);
    }

    public BatchTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchTranslateResponse setBody(BatchTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchTranslateResponseBody getBody() {
        return this.body;
    }

}
