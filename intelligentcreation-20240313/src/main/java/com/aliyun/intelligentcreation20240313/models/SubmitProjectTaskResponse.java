// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitProjectTaskResponseBody body;

    public static SubmitProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectTaskResponse self = new SubmitProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitProjectTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitProjectTaskResponse setBody(SubmitProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitProjectTaskResponseBody getBody() {
        return this.body;
    }

}
