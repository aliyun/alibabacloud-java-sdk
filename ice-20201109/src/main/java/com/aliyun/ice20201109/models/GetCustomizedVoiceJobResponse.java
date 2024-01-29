// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomizedVoiceJobResponseBody body;

    public static GetCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceJobResponse self = new GetCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomizedVoiceJobResponse setBody(GetCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
