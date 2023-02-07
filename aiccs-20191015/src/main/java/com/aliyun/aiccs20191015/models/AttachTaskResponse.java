// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AttachTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachTaskResponseBody body;

    public static AttachTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachTaskResponse self = new AttachTaskResponse();
        return TeaModel.build(map, self);
    }

    public AttachTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachTaskResponse setBody(AttachTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachTaskResponseBody getBody() {
        return this.body;
    }

}
