// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAuditNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAuditNoteResponseBody body;

    public static SubmitAuditNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditNoteResponse self = new SubmitAuditNoteResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAuditNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAuditNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAuditNoteResponse setBody(SubmitAuditNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAuditNoteResponseBody getBody() {
        return this.body;
    }

}
