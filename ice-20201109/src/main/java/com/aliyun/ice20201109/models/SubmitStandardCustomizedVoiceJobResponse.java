// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitStandardCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitStandardCustomizedVoiceJobResponseBody body;

    public static SubmitStandardCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitStandardCustomizedVoiceJobResponse self = new SubmitStandardCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitStandardCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitStandardCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitStandardCustomizedVoiceJobResponse setBody(SubmitStandardCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitStandardCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
