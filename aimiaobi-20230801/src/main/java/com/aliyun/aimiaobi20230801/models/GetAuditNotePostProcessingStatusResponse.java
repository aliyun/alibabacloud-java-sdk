// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNotePostProcessingStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditNotePostProcessingStatusResponseBody body;

    public static GetAuditNotePostProcessingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNotePostProcessingStatusResponse self = new GetAuditNotePostProcessingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditNotePostProcessingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditNotePostProcessingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditNotePostProcessingStatusResponse setBody(GetAuditNotePostProcessingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditNotePostProcessingStatusResponseBody getBody() {
        return this.body;
    }

}
