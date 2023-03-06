// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetShareSpeechModelAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetShareSpeechModelAudioResponseBody body;

    public static GetShareSpeechModelAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareSpeechModelAudioResponse self = new GetShareSpeechModelAudioResponse();
        return TeaModel.build(map, self);
    }

    public GetShareSpeechModelAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareSpeechModelAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareSpeechModelAudioResponse setBody(GetShareSpeechModelAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareSpeechModelAudioResponseBody getBody() {
        return this.body;
    }

}
