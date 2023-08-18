// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomizedVoiceResponseBody body;

    public static GetCustomizedVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceResponse self = new GetCustomizedVoiceResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomizedVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomizedVoiceResponse setBody(GetCustomizedVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomizedVoiceResponseBody getBody() {
        return this.body;
    }

}
