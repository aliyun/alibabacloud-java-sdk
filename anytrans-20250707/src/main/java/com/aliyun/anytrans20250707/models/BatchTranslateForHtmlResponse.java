// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateForHtmlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchTranslateForHtmlResponseBody body;

    public static BatchTranslateForHtmlResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateForHtmlResponse self = new BatchTranslateForHtmlResponse();
        return TeaModel.build(map, self);
    }

    public BatchTranslateForHtmlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchTranslateForHtmlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchTranslateForHtmlResponse setBody(BatchTranslateForHtmlResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchTranslateForHtmlResponseBody getBody() {
        return this.body;
    }

}
