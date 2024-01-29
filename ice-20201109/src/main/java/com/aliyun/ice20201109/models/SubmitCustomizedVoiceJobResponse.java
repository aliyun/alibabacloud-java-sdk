// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCustomizedVoiceJobResponseBody body;

    public static SubmitCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizedVoiceJobResponse self = new SubmitCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCustomizedVoiceJobResponse setBody(SubmitCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
