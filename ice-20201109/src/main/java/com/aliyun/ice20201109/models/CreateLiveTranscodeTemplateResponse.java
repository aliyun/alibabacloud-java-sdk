// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveTranscodeTemplateResponseBody body;

    public static CreateLiveTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveTranscodeTemplateResponse self = new CreateLiveTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveTranscodeTemplateResponse setBody(CreateLiveTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
