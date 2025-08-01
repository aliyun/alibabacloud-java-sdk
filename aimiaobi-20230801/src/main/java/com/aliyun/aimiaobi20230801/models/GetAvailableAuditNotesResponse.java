// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAvailableAuditNotesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvailableAuditNotesResponseBody body;

    public static GetAvailableAuditNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableAuditNotesResponse self = new GetAvailableAuditNotesResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailableAuditNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailableAuditNotesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvailableAuditNotesResponse setBody(GetAvailableAuditNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailableAuditNotesResponseBody getBody() {
        return this.body;
    }

}
