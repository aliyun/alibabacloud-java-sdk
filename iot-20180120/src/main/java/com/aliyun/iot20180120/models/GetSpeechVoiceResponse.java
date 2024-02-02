// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpeechVoiceResponseBody body;

    public static GetSpeechVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechVoiceResponse self = new GetSpeechVoiceResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpeechVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpeechVoiceResponse setBody(GetSpeechVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpeechVoiceResponseBody getBody() {
        return this.body;
    }

}
