// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuditNoteResponseBody body;

    public static DeleteAuditNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuditNoteResponse self = new DeleteAuditNoteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuditNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuditNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuditNoteResponse setBody(DeleteAuditNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuditNoteResponseBody getBody() {
        return this.body;
    }

}
