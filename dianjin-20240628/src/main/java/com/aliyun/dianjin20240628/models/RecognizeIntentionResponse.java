// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecognizeIntentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeIntentionResponseBody body;

    public static RecognizeIntentionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIntentionResponse self = new RecognizeIntentionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIntentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeIntentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeIntentionResponse setBody(RecognizeIntentionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeIntentionResponseBody getBody() {
        return this.body;
    }

}
