// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateSpeechTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpeechTemplateResponseBody body;

    public static UpdateSpeechTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechTemplateResponse self = new UpdateSpeechTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpeechTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSpeechTemplateResponse setBody(UpdateSpeechTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpeechTemplateResponseBody getBody() {
        return this.body;
    }

}
