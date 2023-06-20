// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class PushStoreSpeechDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushStoreSpeechDataResponseBody body;

    public static PushStoreSpeechDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushStoreSpeechDataResponse self = new PushStoreSpeechDataResponse();
        return TeaModel.build(map, self);
    }

    public PushStoreSpeechDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushStoreSpeechDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushStoreSpeechDataResponse setBody(PushStoreSpeechDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushStoreSpeechDataResponseBody getBody() {
        return this.body;
    }

}
