// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo3DAvatarVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTextTo3DAvatarVideoTaskResponseBody body;

    public static SubmitTextTo3DAvatarVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo3DAvatarVideoTaskResponse self = new SubmitTextTo3DAvatarVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo3DAvatarVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTextTo3DAvatarVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTextTo3DAvatarVideoTaskResponse setBody(SubmitTextTo3DAvatarVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTextTo3DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

}
