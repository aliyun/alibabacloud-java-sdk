// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DownloadAuditNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadAuditNoteResponseBody body;

    public static DownloadAuditNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAuditNoteResponse self = new DownloadAuditNoteResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAuditNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadAuditNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadAuditNoteResponse setBody(DownloadAuditNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadAuditNoteResponseBody getBody() {
        return this.body;
    }

}
