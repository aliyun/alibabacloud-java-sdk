// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOperationAuditResponseBody body;

    public static CancelOperationAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationAuditResponse self = new CancelOperationAuditResponse();
        return TeaModel.build(map, self);
    }

    public CancelOperationAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOperationAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOperationAuditResponse setBody(CancelOperationAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOperationAuditResponseBody getBody() {
        return this.body;
    }

}
