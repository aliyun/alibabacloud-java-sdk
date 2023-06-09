// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo3DAvatarVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAudioTo3DAvatarVideoTaskResponseBody body;

    public static SubmitAudioTo3DAvatarVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo3DAvatarVideoTaskResponse self = new SubmitAudioTo3DAvatarVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo3DAvatarVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponse setBody(SubmitAudioTo3DAvatarVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAudioTo3DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

}
