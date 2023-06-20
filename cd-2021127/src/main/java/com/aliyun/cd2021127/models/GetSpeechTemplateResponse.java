// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetSpeechTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpeechTemplateResponseBody body;

    public static GetSpeechTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechTemplateResponse self = new GetSpeechTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpeechTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpeechTemplateResponse setBody(GetSpeechTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpeechTemplateResponseBody getBody() {
        return this.body;
    }

}
