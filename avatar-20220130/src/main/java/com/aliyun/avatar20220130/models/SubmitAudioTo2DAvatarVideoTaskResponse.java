// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo2DAvatarVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAudioTo2DAvatarVideoTaskResponseBody body;

    public static SubmitAudioTo2DAvatarVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo2DAvatarVideoTaskResponse self = new SubmitAudioTo2DAvatarVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo2DAvatarVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponse setBody(SubmitAudioTo2DAvatarVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAudioTo2DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

}
