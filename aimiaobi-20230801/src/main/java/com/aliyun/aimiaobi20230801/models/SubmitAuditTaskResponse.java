// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAuditTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAuditTaskResponseBody body;

    public static SubmitAuditTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditTaskResponse self = new SubmitAuditTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAuditTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAuditTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAuditTaskResponse setBody(SubmitAuditTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAuditTaskResponseBody getBody() {
        return this.body;
    }

}
