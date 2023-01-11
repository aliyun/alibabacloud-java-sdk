// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PullTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PullTaskResponseBody body;

    public static PullTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PullTaskResponse self = new PullTaskResponse();
        return TeaModel.build(map, self);
    }

    public PullTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PullTaskResponse setBody(PullTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PullTaskResponseBody getBody() {
        return this.body;
    }

}
