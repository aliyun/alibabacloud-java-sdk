// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class SubmitTuringTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTuringTaskResponseBody body;

    public static SubmitTuringTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTuringTaskResponse self = new SubmitTuringTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTuringTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTuringTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTuringTaskResponse setBody(SubmitTuringTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTuringTaskResponseBody getBody() {
        return this.body;
    }

}
