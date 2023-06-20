// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateSpeechTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpeechTemplateResponseBody body;

    public static CreateSpeechTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpeechTemplateResponse self = new CreateSpeechTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpeechTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpeechTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSpeechTemplateResponse setBody(CreateSpeechTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpeechTemplateResponseBody getBody() {
        return this.body;
    }

}
