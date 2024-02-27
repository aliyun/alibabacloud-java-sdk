// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo2DAvatarVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTextTo2DAvatarVideoTaskResponseBody body;

    public static SubmitTextTo2DAvatarVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo2DAvatarVideoTaskResponse self = new SubmitTextTo2DAvatarVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo2DAvatarVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTextTo2DAvatarVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTextTo2DAvatarVideoTaskResponse setBody(SubmitTextTo2DAvatarVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

}
