// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PushRpaTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushRpaTaskResponseBody body;

    public static PushRpaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRpaTaskResponse self = new PushRpaTaskResponse();
        return TeaModel.build(map, self);
    }

    public PushRpaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushRpaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushRpaTaskResponse setBody(PushRpaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PushRpaTaskResponseBody getBody() {
        return this.body;
    }

}
