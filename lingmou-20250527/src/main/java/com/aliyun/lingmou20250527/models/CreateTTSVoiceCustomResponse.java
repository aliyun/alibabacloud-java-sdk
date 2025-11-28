// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTTSVoiceCustomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTTSVoiceCustomResponseBody body;

    public static CreateTTSVoiceCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTTSVoiceCustomResponse self = new CreateTTSVoiceCustomResponse();
        return TeaModel.build(map, self);
    }

    public CreateTTSVoiceCustomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTTSVoiceCustomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTTSVoiceCustomResponse setBody(CreateTTSVoiceCustomResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTTSVoiceCustomResponseBody getBody() {
        return this.body;
    }

}
