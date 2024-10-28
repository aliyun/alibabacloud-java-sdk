// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class RecognizeAudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeAudioResponseBody body;

    public static RecognizeAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAudioResponse self = new RecognizeAudioResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeAudioResponse setBody(RecognizeAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAudioResponseBody getBody() {
        return this.body;
    }

}
