// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpeechResponseBody body;

    public static CreateSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpeechResponse self = new CreateSpeechResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpeechResponse setBody(CreateSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpeechResponseBody getBody() {
        return this.body;
    }

}
