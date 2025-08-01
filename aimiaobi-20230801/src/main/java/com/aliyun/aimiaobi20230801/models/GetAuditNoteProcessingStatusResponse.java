// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNoteProcessingStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditNoteProcessingStatusResponseBody body;

    public static GetAuditNoteProcessingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNoteProcessingStatusResponse self = new GetAuditNoteProcessingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditNoteProcessingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditNoteProcessingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditNoteProcessingStatusResponse setBody(GetAuditNoteProcessingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditNoteProcessingStatusResponseBody getBody() {
        return this.body;
    }

}
