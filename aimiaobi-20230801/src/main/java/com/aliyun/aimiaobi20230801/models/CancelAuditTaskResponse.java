// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelAuditTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAuditTaskResponseBody body;

    public static CancelAuditTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAuditTaskResponse self = new CancelAuditTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelAuditTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAuditTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAuditTaskResponse setBody(CancelAuditTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAuditTaskResponseBody getBody() {
        return this.body;
    }

}
