// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiCallTaskResponseBody body;

    public static UpdateAiCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiCallTaskResponse self = new UpdateAiCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiCallTaskResponse setBody(UpdateAiCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiCallTaskResponseBody getBody() {
        return this.body;
    }

}
