// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpeechResponseBody body;

    public static UpdateSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechResponse self = new UpdateSpeechResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSpeechResponse setBody(UpdateSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpeechResponseBody getBody() {
        return this.body;
    }

}
