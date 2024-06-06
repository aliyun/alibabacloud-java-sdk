// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranslateImageBatchResponseBody body;

    public static TranslateImageBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageBatchResponse self = new TranslateImageBatchResponse();
        return TeaModel.build(map, self);
    }

    public TranslateImageBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateImageBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateImageBatchResponse setBody(TranslateImageBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateImageBatchResponseBody getBody() {
        return this.body;
    }

}
