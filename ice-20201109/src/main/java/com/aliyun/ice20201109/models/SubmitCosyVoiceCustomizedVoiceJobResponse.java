// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCosyVoiceCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCosyVoiceCustomizedVoiceJobResponseBody body;

    public static SubmitCosyVoiceCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCosyVoiceCustomizedVoiceJobResponse self = new SubmitCosyVoiceCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponse setBody(SubmitCosyVoiceCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCosyVoiceCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
