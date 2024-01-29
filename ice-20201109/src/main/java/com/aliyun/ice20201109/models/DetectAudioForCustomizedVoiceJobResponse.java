// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectAudioForCustomizedVoiceJobResponseBody body;

    public static DetectAudioForCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectAudioForCustomizedVoiceJobResponse self = new DetectAudioForCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public DetectAudioForCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectAudioForCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectAudioForCustomizedVoiceJobResponse setBody(DetectAudioForCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectAudioForCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
