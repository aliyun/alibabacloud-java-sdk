// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCasterSceneAudioResponseBody body;

    public static UpdateCasterSceneAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneAudioResponse self = new UpdateCasterSceneAudioResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasterSceneAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCasterSceneAudioResponse setBody(UpdateCasterSceneAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasterSceneAudioResponseBody getBody() {
        return this.body;
    }

}
