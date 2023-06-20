// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteSpeechTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpeechTemplateResponseBody body;

    public static DeleteSpeechTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpeechTemplateResponse self = new DeleteSpeechTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpeechTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpeechTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSpeechTemplateResponse setBody(DeleteSpeechTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpeechTemplateResponseBody getBody() {
        return this.body;
    }

}
