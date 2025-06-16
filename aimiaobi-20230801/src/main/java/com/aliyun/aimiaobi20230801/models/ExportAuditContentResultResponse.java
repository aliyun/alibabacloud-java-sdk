// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportAuditContentResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportAuditContentResultResponseBody body;

    public static ExportAuditContentResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportAuditContentResultResponse self = new ExportAuditContentResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportAuditContentResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportAuditContentResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportAuditContentResultResponse setBody(ExportAuditContentResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportAuditContentResultResponseBody getBody() {
        return this.body;
    }

}
