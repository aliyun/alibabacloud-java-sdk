// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LanguageDetectResponseBody body;

    public static LanguageDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        LanguageDetectResponse self = new LanguageDetectResponse();
        return TeaModel.build(map, self);
    }

    public LanguageDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LanguageDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LanguageDetectResponse setBody(LanguageDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public LanguageDetectResponseBody getBody() {
        return this.body;
    }

}
