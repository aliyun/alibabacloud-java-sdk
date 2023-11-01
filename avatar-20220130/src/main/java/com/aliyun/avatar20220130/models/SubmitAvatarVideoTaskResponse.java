// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAvatarVideoTaskResponseBody body;

    public static SubmitAvatarVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoTaskResponse self = new SubmitAvatarVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAvatarVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAvatarVideoTaskResponse setBody(SubmitAvatarVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

}
