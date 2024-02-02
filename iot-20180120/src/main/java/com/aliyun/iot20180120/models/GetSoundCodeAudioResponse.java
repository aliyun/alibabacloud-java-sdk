// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeAudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSoundCodeAudioResponseBody body;

    public static GetSoundCodeAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeAudioResponse self = new GetSoundCodeAudioResponse();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSoundCodeAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSoundCodeAudioResponse setBody(GetSoundCodeAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSoundCodeAudioResponseBody getBody() {
        return this.body;
    }

}
