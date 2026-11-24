// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class RealtimeSpeechTranslationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RealtimeSpeechTranslationResponseBody body;

    public static RealtimeSpeechTranslationResponse build(java.util.Map<String, ?> map) throws Exception {
        RealtimeSpeechTranslationResponse self = new RealtimeSpeechTranslationResponse();
        return TeaModel.build(map, self);
    }

    public RealtimeSpeechTranslationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RealtimeSpeechTranslationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RealtimeSpeechTranslationResponse setBody(RealtimeSpeechTranslationResponseBody body) {
        this.body = body;
        return this;
    }
    public RealtimeSpeechTranslationResponseBody getBody() {
        return this.body;
    }

}
