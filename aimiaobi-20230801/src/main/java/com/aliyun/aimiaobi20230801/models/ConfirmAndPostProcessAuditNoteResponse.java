// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ConfirmAndPostProcessAuditNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmAndPostProcessAuditNoteResponseBody body;

    public static ConfirmAndPostProcessAuditNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAndPostProcessAuditNoteResponse self = new ConfirmAndPostProcessAuditNoteResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAndPostProcessAuditNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAndPostProcessAuditNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAndPostProcessAuditNoteResponse setBody(ConfirmAndPostProcessAuditNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAndPostProcessAuditNoteResponseBody getBody() {
        return this.body;
    }

}
