// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomizedVoiceJobResponseBody body;

    public static CreateCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedVoiceJobResponse self = new CreateCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomizedVoiceJobResponse setBody(CreateCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
