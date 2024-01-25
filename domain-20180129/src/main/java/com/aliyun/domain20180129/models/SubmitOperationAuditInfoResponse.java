// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationAuditInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitOperationAuditInfoResponseBody body;

    public static SubmitOperationAuditInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationAuditInfoResponse self = new SubmitOperationAuditInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOperationAuditInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOperationAuditInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitOperationAuditInfoResponse setBody(SubmitOperationAuditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOperationAuditInfoResponseBody getBody() {
        return this.body;
    }

}
