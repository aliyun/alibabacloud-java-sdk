// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateCustomizedVoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomizedVoiceResponseBody body;

    public static UpdateCustomizedVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizedVoiceResponse self = new UpdateCustomizedVoiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizedVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomizedVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomizedVoiceResponse setBody(UpdateCustomizedVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomizedVoiceResponseBody getBody() {
        return this.body;
    }

}
